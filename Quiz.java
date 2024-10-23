// Azarya Duer
// 29 September 2024
// Files: Quiz.java
// In this program, user will be asked questions.
// After answering, program will display user's score.

// import java.io.*;
import java.util.*;

public class Quiz{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      
      int score = 0;
      
      
      // First Question
      System.out.println("Q1) How much sleep do college students get on average?");
      System.out.println("    1) 9");
      System.out.println("    2) 7");
      System.out.println("    3) 5");
      int firstAnswer = keyboard.nextInt();
      
      if (firstAnswer == 2) {
         System.out.println("That's right!");
         score += 1;
      }
      else {
         System.out.println("Sorry, that is incorrect.");
      }
            
      // Second Question
      System.out.println("Q2) How many toes do most cats have?");
      System.out.println("    1) 20");
      System.out.println("    2) 18");
      System.out.println("    3) 16");
      int secondAnswer = keyboard.nextInt();
      
      if (secondAnswer == 2) {
         System.out.println("That's right!");
         score += 1;
      }
      else {
         System.out.println("Sorry, that is incorrect.");
      }
      
      // Third Question
      System.out.println("Q3) What is the right way to eat steak?");
      System.out.println("    1) Well-done");
      System.out.println("    2) Blue");
      System.out.println("    3) Medium Rare");
      int thirdAnswer = keyboard.nextInt();
      
      if (thirdAnswer == 3) {
         System.out.println("That's right!");
         score += 1;
      }
      else {
         System.out.println("Sorry, that is incorrect.");
      }
      
      //score
      System.out.println("You got " + score + " out of 3 correct.");

      
      
   }// end main method
}// end class Quiz
