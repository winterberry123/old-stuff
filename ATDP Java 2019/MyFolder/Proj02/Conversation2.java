/**
 * Have a brief conversation with the user.
 * 
 * @author Joyce Chen
 * @version Summer 2019 
 */

import java.util.Scanner;

public class Conversation2
{
  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in); // Create keyboard object to get input from user
    
    System.out.print("How are you? "); // Ask user
    String condition = kboard.nextLine();         // Accept answer from user
    
    System.out.println("Welcome to Java!");
    
    System.out.print("What grade are you in? "); // Ask user
    int grade = kboard.nextInt();              // Accept answer from user

    int yearsUntilGraduation = 12-grade;
    System.out.println("In " + yearsUntilGraduation + " years, you will graduate from high school ");    
        
    System.out.print("How much money do you have on you right now?"); // Ask user
    double money = kboard.nextDouble();              // Accept answer from user
    System.out.println("Great! Can I borrow some?");    
    
    String bye = "It's okay, I'll return it to you later."; // This is how a String variable is assigned
    System.out.println(bye);
    
    kboard.close(); // Done using the keyboard
  }
}
