
/**
 * Write a description of class PhoneNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhoneNumbers
{
   /**
      Cleans a phone number.
      @param phoneNumber a phone number that should contain ten digits and possibly other characters
      @return the phone number in the form (###) ###-#### or the string "Error" if phoneNumber
      does not have ten digits
   */
   public String cleanNumber(String phoneNumber)
   {   
   String str = "";
      for (int i = 0; i < phoneNumber.length(); i++)
      {
         char ch = phoneNumber.charAt(i);
         if (Character.isDigit(ch))
         {
            str = str + ch;
         }
      
      }
      if (str.length()==10){
         String sub1 = str.substring (0,3);
         String sub2 = str.substring (3,6);
         String sub3 = str.substring (6,10);
         return "(" + sub1 + ") "+sub2 + "-" + sub3;
    
      }
      else {
         return "Error";
      }
      
   }
}   


