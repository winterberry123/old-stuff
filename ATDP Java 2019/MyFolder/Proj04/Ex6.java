import java.util.Scanner;
/**
 * E4.6
 *
 * @author Joyce Chen
 * @version 01
 */
public class Ex6
{
   public static void main(String[]args){
       Scanner in = new Scanner (System.in);
       
       System.out.println("Enter a measurement in meters:");
       double measurement = in.nextDouble();
       
       double miles = measurement * 0.000621371;
       double feet = measurement * 3.28084;
       double inches = measurement * 39.3701;
       
       System.out.printf("Measurement in miles: " + "%.3f", miles);
       System.out.println();
       System.out.printf("Measurement in feet: " + "%.1f", feet);
       System.out.println();
       System.out.printf("Measurement in inches: " + "%.1f", inches);
       System.out.println();
       
    }
}
