
/**
 * This class represents a bank account.
 * 
 * characteristics: balance
 * behaviors: deposit, withdraw, get balance
 * 
 * @author Joyce Chen
 * @version1.0
 */
public class BankAccount
{
    //Fields (should be private )
    private double balance;
    

    //Constructors (should be public)
    /**
     * Initialize balance to zero.
     */
    public BankAccount () {
        balance = 0;
    }
    
    /**
     * Initialize balance to given amount.
     * @param initBalance Amount to start
     */
    public BankAccount(double initBalance) {
        balance = initBalance;   
        //don't put "double" before balance; balance was already declared in the fields
    }
  
    //Methods
    /**
     * Deposit given amount.
     * @param amt Amount to deposit
     */
    public void deposit(double amt) {
        balance = balance + amt;
    }
    
     /**
     * Withdraw given amount.
     * @param amt Amount to withdraw
     */
    public void withdraw(double amt) {
        balance = balance - amt;
    }
    
    //if a method is not void, you HAVE to have a return statement
     /**
     * Return the balance.
     * @return Current balance
     */
    public double getBalance () {
        return balance;
    }
    
    public void addInterest(double rate) {
     balance = balance + balance*rate*0.01;   
    }
    
    
}
