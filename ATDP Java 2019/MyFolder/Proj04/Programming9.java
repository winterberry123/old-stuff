import java.util.Scanner;
/**
 * Programming Pr0jects 4.9
 *
 * @author Joyce Chen
 * @version 01
 */
public class Programming9
{
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        System.out.print ("Enter amount due in pennies:");
        int amountDue = in.nextInt();
        System.out.print ("Enter amount received from customer in pennies:");
        int amountReceived = in.nextInt();
        
        int amountReturn = amountReceived - amountDue;
        int numOfDollars = amountReturn / 100;
        int numOfQuarters = amountReturn % 100 / 25;
        int numOfDimes = amountReturn % 25 / 10;
        int numOfNickels = (amountReturn-numOfDollars*100-numOfQuarters*25-numOfDimes*10) % 10 / 5;
        int numOfPennies = amountReturn % 5; 
        System.out.println ("Amount that is returned: "+numOfDollars+" dollars "+numOfQuarters+" quarters "+numOfDimes+" dimes "+numOfNickels+" nickels "+numOfPennies+" pennies ");
        
        
    }
}
