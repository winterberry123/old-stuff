
/**
 *
 * @author Joyce Chen
 * @version 01
 */
public class PayCheck
{
    private String employeeName;
    private double hourlyWage;
    private double hoursWorked;

    public PayCheck(double wage, String yourName)
    {
        hourlyWage = wage;
        employeeName = yourName;
    }


    public void addHours (double hoursAdded)
    {
        hoursWorked = hoursWorked + hoursAdded;
    }
    
    public void raisePay (double dollarAmount)
    {
        hourlyWage = hourlyWage + dollarAmount;
    }
    
    public double calcWeekPay ()
    {
        double payAmount = 0;
        double hourlyWage2 = hourlyWage * 1.5;
        if (hoursWorked > 40){
            payAmount = hourlyWage2 * (hoursWorked - 40);
            hoursWorked = 40;
        }
       
        payAmount = hoursWorked * hourlyWage + payAmount;
        hoursWorked = 0;
        return payAmount;
    }
    public String toString (){
     String sentence = employeeName + " worked for " + hoursWorked + " hours at $" + hourlyWage + " per hour. ";  
     return sentence;
    }
}
