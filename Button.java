// Azarya Duer
// 29 September 2024
// Files: Button.java
// In this program, user will input information about a point, a circle and a rectangle.
// Program will then tell if the given point is inside the rectangle or circle.

// import java.io.*;
import java.util.*;
public class Button{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      
      //user inputs
      System.out.print("Enter the width and height of rectangle:  ");
      double width = keyboard.nextDouble();
      double height = keyboard.nextDouble();
      
      System.out.print("Enter the radius of the circle:  ");
      double radius = keyboard.nextDouble();
      
      System.out.print("Enter values for a point (x,y):  ");
      double x = keyboard.nextDouble();
      double y = keyboard.nextDouble();
      
      //true or false values
      boolean inRect = x >= 0 && x <= width && y >= 0 && y <= height;
      boolean inCircle = Math.pow(radius, 2) >= Math.pow(x, 2) + Math.pow(y, 2);
      
      //start of conditionals
      if(inRect && inCircle) {
         System.out.println("The point is in both the circle and rectangle.");
      }
      else if (inCircle) {
         System.out.println("The point is inside the circle only.");
      }
      else if (inRect) {
         System.out.println("The point is in the rectangle only.");
      }
      else {
         System.out.println("The point is in neither shape.");
      }
      
   }// end main method
}// end class button
