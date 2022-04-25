import java.util.Scanner;
/**
 *
 * @author Joyce Chen
 * @version 01
 */
public class ComputeTax
{
    public static void main(String [] args) {
    
        double tax = 0;
        Scanner in = new Scanner (System.in);
        System.out.println();
        System.out.print ("Are you single or married? ");
        String status = in.next();
        System.out.print ("What is your taxable income? ");
        double income = in.nextDouble();
        
        if (status.equals("single")) {
            if ((income >= 0) && (income <= 8000)) {
                tax = 0.1;
           }
            else if ((income >= 8000) && (income <= 32000)) {
            tax = 800 + 0.15 * income;
           }
            else {
            tax = 4400 + 0.25 * income;
           }
        }
        else {
            if ((income >= 0) && (income <= 16000)) {
            tax = 0.1;
           }
            else if ((income >= 16000) && (income <= 64000)) {
            tax = 1600 + 0.15 * income;
           }
            else {
            tax = 8800 + 0.25 * income;
           }
        }
        System.out.println ("Tax is: " + tax);
    }
 
}