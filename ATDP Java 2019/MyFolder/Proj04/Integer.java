import java.util.Scanner;

public class Integer
{
    public static void main(String [] args) {
        Scanner int1 = new Scanner (System.in);
        
        System.out.print ("Enter first integer:");
        int firstInt = int1.nextInt();
        System.out.print ("Enter second integer:");
        int secondInt = int1.nextInt();
        
        System.out.print ("Sum:");
        System.out.println(firstInt + secondInt);
        
        System.out.print ("Difference:");
        System.out.println(firstInt - secondInt);
        
        System.out.print ("Product:");
        System.out.println(firstInt * secondInt);
        
        System.out.print ("Average:");
        System.out.println((firstInt + secondInt)/2);
        
        System.out.print ("Distance:");
        System.out.println(Math.abs(firstInt - secondInt));
        
        System.out.print ("Maximum:");
        System.out.println(Math.max(firstInt, secondInt));
        
        System.out.print ("Minimum:");
        System.out.println(Math.min(firstInt, secondInt));
        
    }
}
