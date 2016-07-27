package mastermind; 
 import java.io.BufferedReader; 
 import java.io.FileNotFoundException; 
 import java.io.FileReader; 
 import java.io.IOException; 
 import java.util.ArrayList; 
 import java.util.HashSet; 
 import java.util.Scanner; 
 import java.util.Set; 
 
 
 public class WordGuess3 { 
     public static void main(String[] args) throws IOException { 
         int difficulty = 3; 
         Scanner Scan = new Scanner(System.in); 
         ArrayList<String> dictionary = getWords(difficulty); 
         HashSet<Character> finalLetter = new HashSet<>(); 
         HashSet<Character> possibleLetters = new HashSet<>(); 
         String hiddenWord = dictionary.get((int)(Math.random()*dictionary.size())); 
         boolean Compwon =false; 
 
 
         while(!Compwon){ 
             String currentWord = selectWords(dictionary); 
             int matches = Scan.nextInt(); 
             if( matches > 0 ){ 
                 //char character = oneChar() 
             } 
         } 
     } 
 
 
     public static ArrayList<String> getWords(int length) { 
         ArrayList<String> Words = new ArrayList<String>(); 
         try { 
             BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\palsulea\\IdeaProjects\\Test\\src\\sowpods.txt")); 
             String line = ""; 
             while ((line = reader.readLine()) != null) { 
                 String[] splitted = line.split("\\n"); 
                 for(String w:splitted) 
                     Words.add(w); 
             } 
         } 
 
 
         catch (FileNotFoundException e) { 
             e.printStackTrace(); 
         } catch (IOException e) { 
             e.printStackTrace(); 
         } 
         return Words; 
     } 
 
 
     public static char oneChar(Set<Character> possibleChars , String word){ 
         char letters[] = word.toCharArray(); 
         char selectedChar = ' '; 
         for(char letter : letters){ 
         if(possibleChars.contains(letter)){ 
             possibleChars.remove(letter); 
             selectedChar = letter; 
         }else{ 
             possibleChars.add(letter); 
         } 
         } 
         return selectedChar; 
     } 
 
 
     public static String selectWords(ArrayList<String> dictionary){ 
         String word = dictionary.get(0); 
         dictionary.remove(0); 
         return word;   
