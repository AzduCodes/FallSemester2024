// Azarya Duer
// 29 September 2024
// Files: Legal.java
// In this program, user will input their information.
// In return, program will tell user what is legal.

//import java.io.*;
import java.util.*;
public class Legal{
   public static void main(String[] args){
   
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Hey, what's your name? ");
      String usersName = keyboard.nextLine();
      
      System.out.println();
      
      System.out.print("Ok, " + usersName + ", how old are you? ");
      int usersAge = keyboard.nextInt();
      
      System.out.println();
      
      // start of conditionals
      if (usersAge < 16) {
         System.out.print("You can't drive.");
      }
      else if (usersAge == 16 || usersAge == 17) {
         System.out.print("You can drive but not vote.");
      }
      else if (usersAge >= 18 && usersAge <= 24) {
         System.out.print("You can vote but not rent a car.");
      }
      else {
         System.out.print("You can do pretty much anything.");
      }

   }// end main method
}//end class Legal
