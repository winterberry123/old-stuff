/**
   This class tests the CashRegisterATDP class.
*/
public class CashRegisterTester
{
   public static void main(String[] args)
   {
       final double DOLLAR_VALUE = 1.0;
       final double QUARTER_VALUE = 0.25;
       final double DIME_VALUE = 0.1;
       final double NICKEL_VALUE = 0.05;
       final double PENNY_VALUE = 0.01;
       
      // FIRST PURCHASE
      // Create CashRegister3 object, and 
      // record price for each purchased item
      
      System.out.println("\nFIRST PURCHASE");
      
      CashRegister3 register = new CashRegister3(); 
      register.recordPurchase(0.25);
      register.recordPurchase(1.25);
      
      // Create Coin objects, and
      // Record price for each type of coin
      Coin dollar = new Coin(DOLLAR_VALUE, "Dollar");
      register.receivePayment(1, dollar);
      Coin quarter = new Coin(QUARTER_VALUE, "Quarter");
      register.receivePayment(2, quarter);
      Coin dime = new Coin(DIME_VALUE, "Dime");
      register.receivePayment(0, dime);
      Coin nickel = new Coin(NICKEL_VALUE, "Nickel");
      register.receivePayment(0, nickel);
      Coin penny = new Coin(PENNY_VALUE, "Penny");
      register.receivePayment(0, penny);
      
      // Calculate & display change amount, in pennies
      System.out.println("\tExpected change amount: 0.00");
      int[] change0 = register.giveChange();
      System.out.println ("Change:\n" + change0 [0] + " dollars\n"+ change0 [1] + " quarters\n"+ change0 [2] + " dimes\n"+ change0 [3] + " nickels\n"+ change0 [4] + " pennies\n");
   

      
      // SECOND PURCHASE
      // NOTE: Do NOT creat CashRegisterATDP object again
      // Record price for each purchased item
      
      System.out.println("\nSECOND PURCHASE");
            
      register.recordPurchase(2.25);
      register.recordPurchase(19.25);
      
      // NOTE: Do NOT creat Coin objects again
      // Record price for each type of coin
      register.receivePayment(23, dollar);
      register.receivePayment(2, quarter);
      register.receivePayment(0, dime);
      register.receivePayment(0, nickel);
      register.receivePayment(0, penny);
      
      
      
      // Calculate & display change amount, in pennies
      double [] receipt = register.getReceiptVals ();
      int [] change = register.giveChange();
      System.out.println ("Number of items: " + receipt [0]);
      System.out.println ("Total: " + receipt [1]);
      System.out.println ("Payment: " + receipt [2]);
      System.out.println("\tExpected change amount: 2.00" );
      System.out.println ("Change:\n" + change [0] + " dollars\n"+ change [1] + " quarters\n"+ change [2] + " dimes\n"+ change [3] + " nickels\n"+ change [4] + " pennies\n");
   }
}
