/**
* A cash register totals up sales and computes change due.
* @author A. Nguyen 
* @version 1.0
*/
public class CashRegisterATDP
{
   private double purchase;
   private double payment;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegisterATDP()
   {
      purchase = 0;
      payment = 0;
   }

   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
      purchase += amount;
   }
   

   /**
      Record (part of) the payment, per coin type, and accumlate into total payment
      @param count number of coins received
      @param coinType the coin received
   */
   public void receivePayment(int count, CoinATDP coinType) {
       String coinString = coinType.getName();
       if (coinString.equals("Dollar")){
         payment = payment + count * 1.0;
        }
       else if (coinString.equals("Quarter")){
         payment = payment + count * 0.25;
        }
       else if (coinString.equals("Dime")){
         payment = payment + count * 0.1;
        }
       else if (coinString.equals("Nickel")){
         payment = payment + count * 0.05;
        }
       else{
         payment = payment + count * 0.01;  
        }
    }
   
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {
      double change = payment - purchase;
      payment = 0;
      purchase = 0;
      return change;
   }
}
