public class Inputs
{
   /**
      Gets the choice that the user provided, or null if the 
      user didn't provide a valid choice.
      @param input the user input
      @param maxChoice the maximum valid choice, e.g. "D" if there
      are four choices.
      @return the user input if it was a valid choice (i.e. length 1
      and between "A" and maxChoice), null otherwise
   */
   public String getChoice(String input, String maxChoice)
   {
      // Your work here
      String str = null;
      
      if(input.length() != 1) {
        return null; }
   
      if (input.compareTo("A") >= 0 && input.compareTo(maxChoice)<= 0)
         str = input;
      
      return str;

   }
}