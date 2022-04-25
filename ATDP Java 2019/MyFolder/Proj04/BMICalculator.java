import java.util.Scanner;
/**
 * Write a description of class BMICalculator here.
 *
 * @Joyce Chen
 * @version 01
 */
public class BMICalculator
{
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
   
    System.out.print("What is your name?");
    String name = sc.next();
    System.out.println();
    
    System.out.print("What is your age?");
    int age = sc.nextInt();
    System.out.println();
    
    System.out.print("What is your weight in pounds?");
    double weight = sc.nextDouble();
    System.out.println();
    
    System.out.print("What is your height in inches?");
    double height = sc.nextDouble();
    System.out.println();
    
    double wt = weight * 0.453592;
    double ht = height * 0.0254;
    double bmi = wt/Math.pow (ht, 2);
    System.out.printf("BMI of " + name + ", age" + age + ", is " + "%.1f", bmi);
    
}}
