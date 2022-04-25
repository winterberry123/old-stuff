/**
* A cash register totals up sales and computes change due.
* @author A. Nguyen 
* @version 1.0
*/
public class CashRegister3
{
   private double purchase;
   private double payment;
   private int numOfPurchase;
   private int[] coinArr;
   private double change;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister3()
   {
      purchase = 0;
      payment = 0;
      numOfPurchase = 0;
      coinArr = new int[5];
   }

   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
      purchase += amount;
      numOfPurchase ++;
   }
   

   /**
      Record (part of) the payment, per coin type, and accumlate into total payment
      @param count number of coins received
      @param coinType the coin received
   */
   public void receivePayment(int count, Coin coinType) {
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
   public int [] giveChange()
   {
      change = payment - purchase;
      payment = 0;
      purchase = 0;
      numOfPurchase = 0;
      coinArr[0] = (int) change / 1;
      coinArr[1] = (int) (change % 1 / 0.25);
      coinArr[2] = (int) ((change % 0.25) / 0.1);
      coinArr[3] = (int) ((change - coinArr[0] - coinArr[1] - coinArr[2]) % 0.1 / 0.05);
      coinArr[4] = (int) (change % 0.05);
      return coinArr;
      
   }
   
   public double[] getReceiptVals(){
       double [] receipt = new double [4];
       receipt [0] = numOfPurchase;
       receipt [1] = purchase;
       receipt[2] = payment;
       receipt[3] = change;
       return receipt;
    }
}



