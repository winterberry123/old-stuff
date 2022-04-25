/**
   This class tests the CashRegisterATDP class.
*/
public class CashRegisterATDPTester
{
   public static void main(String[] args)
   {
       final double DOLLAR_VALUE = 1.0;
       final double QUARTER_VALUE = 0.25;
       final double DIME_VALUE = 0.1;
       final double NICKEL_VALUE = 0.05;
       final double PENNY_VALUE = 0.01;
       
      // FIRST PURCHASE
      // Create CashRegisterATDP object, and 
      // record price for each purchased item
      
      System.out.println("\nFIRST PURCHASE");
      
      CashRegisterATDP register = new CashRegisterATDP(); 
      register.recordPurchase(0.25);
      register.recordPurchase(1.25);
      
      // Create Coin objects, and
      // Record price for each type of coin
      CoinATDP dollar = new CoinATDP(DOLLAR_VALUE, "Dollar");
      register.receivePayment(1, dollar);
      CoinATDP quarter = new CoinATDP(QUARTER_VALUE, "Quarter");
      register.receivePayment(2, quarter);
      CoinATDP dime = new CoinATDP(DIME_VALUE, "Dime");
      register.receivePayment(2, dime);
      CoinATDP nickel = new CoinATDP(NICKEL_VALUE, "Nickel");
      register.receivePayment(0, nickel);
      CoinATDP penny = new CoinATDP(PENNY_VALUE, "Penny");
      register.receivePayment(0, penny);
      
      // Calculate & display change amount, in pennies
      System.out.print("\tChange: ");
      System.out.printf("%.2f",register.giveChange());
      System.out.println();
      System.out.println("\tExpected change amount: 0.20");

      
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
      double [] receipt = register.getReceiptVals (register);
      System.out.println ("Number of items: " + receipt [0]);
      System.out.println ("Total: " + receipt [1]);
      System.out.println ("Payment: " + receipt [2]);
      System.out.println ("Change: " + receipt [3]);
      System.out.print("\tChange: ");
      System.out.print(register.giveChange());
      System.out.println();
      System.out.println("\tExpected change amount: 2.00" );
   }
}
