
/**
 * This is to test the BankAccount class.
 *
 * @Joyce Chen
 * @version1.0 June 21, 2019
 */
public class BankAccountTester
{
    public static void main(String args[]) {
        BankAccount myAcct = new BankAccount (0);
        System.out.println ("My balance:" + myAcct.getBalance());
        System.out.println ("Expected balance:"+ 0);
        
        myAcct.deposit (1000);
        System.out.println ("My balance after deposit:" + myAcct.getBalance());
        System.out.println ("Expected balance:"+ 1000);
        
        myAcct.withdraw (500);
        System.out.println ("My balance after first withdraw:" + myAcct.getBalance());
        System.out.println ("Expected balance:"+ 500);
        
        myAcct.withdraw (400);
        System.out.println ("My balance after second withdraw:" + myAcct.getBalance());
        System.out.println ("Expected balance:"+ 100);
        
        myAcct.addInterest(10);
        System.out.println ("My balance after interest:" + myAcct.getBalance());
        System.out.println ("Expected balance:" + 110);
        
    }
}
