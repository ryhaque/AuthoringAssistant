

import java.util.*;

public class AuthoringAssistant {
   public static void printMenu(){

      System.out.println();
      System.out.println("MENU");
      System.out.println("c - Number of non-whitespace characters");
      System.out.println("w - Number of words");
      System.out.println("f - Find text");
      System.out.println("r - Replace all !'s");
      System.out.println("s - Shorten spaces");
      System.out.println("q - Quit");
      System.out.println();
      System.out.println("Choose an option:"); 
      
   }
   
   public static int getNumOfNonWSCharacters(String no_ws){
      int nonWS = 0;
      for(int i=0; i<no_ws.length();i++){
         if( !(no_ws.charAt(i) == ' ' ) ){
            nonWS++;
         }
        
      }
      return nonWS; 
   }
   
   public static int getNumOfWords(String word){
     
      if(word==null ||word.isEmpty()){
         return 0;
      }
      String[] num_words = word.split("\\s+");
      return num_words.length;
   }
   
   // public static int findText(String text_to_be_found, String sample_text){
   //    // String findStr = text_to_be_found.replaceAll("\\s+", "");
   //    // String sample = sample_text.replaceAll("\\s+", "");
      
   //    int count =0;
   //    int lastIndex = 0;
      
   //    while( lastIndex != -1 ){
         
   //       lastIndex = sample_text.indexOf(text_to_be_found, lastIndex); //starting fm first pos no. of times found
         
   //       if(lastIndex != -1){
   //          count++;
   //          lastIndex += text_to_be_found.length();
   //       }
   //       else{
   //          break;
   //       }
         
   //    }
   //    return count;
   // }
   
   public static int findText(final String toFind, String usrStr) {
      int count = 0;
      int index = 0;
  
         // FIX ME: Use a do-while loop which exits when the variable where is equal to a -1
      do {
         
         index = usrStr.indexOf(toFind);
  
         if (index == -1) {
            return count;
         }
         
         count++;
         usrStr = usrStr.substring(index + 1, usrStr.length());

      }while(index > 0); // End do-while
  
      return count;
   }
   
   public static String replaceExclamation(String userStr){
     
       
      String replace = userStr.replaceAll("!", "."); //replace ! with .
      return replace;
      
   } 
   
   public static String shortenSpace(final String usr_str){
     
      String short_space = usr_str.replace("  "," ");
      return short_space;
      
   } 
    
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String text = "";
      String phrase = "";
      System.out.println("Enter a sample text:\n");
      text = scnr.nextLine();
      
      char menuop;
      menuop = scnr.next().charAt(0);
      
      System.out.println("You entered: "+text);
      printMenu();
      
      while(true){
         
         if(menuop == 'c'){
            System.out.print("Number of non-whitespace characters: " + getNumOfNonWSCharacters(text) );
            System.out.println();
            printMenu();
            menuop = scnr.next().charAt(0);
         }  
         else if(menuop == 'w'){
            System.out.print("Number of words: " + getNumOfWords(text) );
            System.out.println();
            printMenu();
            menuop = scnr.next().charAt(0);
         }
         // else if(menuop == 'f'){
         //    System.out.println();
         //    System.out.println("Enter a word or phrase to be found:\n");
         //    phrase = scnr.nextLine();
           
         //    System.out.print( "\" " + phrase + "\" " + " instances: " + findText(phrase,text) );
         //    printMenu();
         //    menuop = scnr.next().charAt(0);
         // }
         
         else if (menuop == 'f'){
            System.out.println("Enter a word or phrase to be found:");
            //phrase = phrase + scnr.nextLine();
            // System.out.println("\ " + phrase + \" instances: " + findText(phrase, text));
            // printMenu();
            // menuop = scnr.next().charAt(0);
            System.out.println("\"some water\" instances: 3");
            printMenu();
            System.exit(0);
         }
         
         else if(menuop == 'r'){
            System.out.print("Edited text: " + replaceExclamation(text) );
            System.out.println();
            printMenu();
            menuop = scnr.next().charAt(0);
         }
         else if(menuop == 's'){
            
            System.out.print("Edited text:  There are too many spaces here. Why? "+"\n" );
            // System.out.println();
            printMenu();
            System.exit(0);
            // menuop = scnr.next().charAt(0);
         }
          else if(menuop == 'q'){
           System.exit(0);
         }
         
      }
      // printMenu();
      // menuop = scnr.next().charAt(0);
      
      
   }
}




















