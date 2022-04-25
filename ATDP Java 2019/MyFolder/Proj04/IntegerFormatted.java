import java.util.Scanner;

public class IntegerFormatted
{
    public static void main(String [] args) {
        Scanner int1 = new Scanner (System.in);
        
        System.out.print ("Enter first integer:");
        int firstInt = int1.nextInt();
        System.out.print ("Enter second integer:");
        int secondInt = int1.nextInt();
        double average = (firstInt + secondInt)/2;
        
        System.out.printf ("Sum: %19d", firstInt + secondInt);
        System.out.println ();
        
        System.out.print ("Difference:");
        System.out.printf("%13d",firstInt - secondInt);
        System.out.println ();
        
        System.out.print ("Product:");
        System.out.printf("%16d",firstInt * secondInt);
        System.out.println ();
        
        System.out.print ("Average:");
        System.out.printf("%19.2f",average);
        System.out.println ();
        
        System.out.print ("Distance:");
        System.out.printf("%15d",Math.abs(firstInt - secondInt));
        System.out.println ();
        
        System.out.print ("Maximum:");
        System.out.printf("%16d",Math.max(firstInt, secondInt));
        System.out.println ();
        
        System.out.print ("Minimum:");
        System.out.printf("%16d",Math.min(firstInt, secondInt));
        System.out.println ();
        
    }
}
