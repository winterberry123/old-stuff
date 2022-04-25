public class Words
{
   /**
      Gets the middle character or character pair from this word 
      when possible.
      @param word a word
      @return the middle character (if the word length is odd) or
      middle two characters (if it is even), or the empty string if 
      the word is empty, or null if it is null.
   */
   public String getMiddle(String word)
   {  
   
      // your work here
      String str = null;
      
      if (word == null) {
         return str;
      }
      else if (word.length() == 0) {
         str = " ";
      }
      else if (word.length()%2 != 0) {
         str = word.substring((word.length()-1)/2, (word.length()-1)/2+1);
      }
      else if (word.length()%2 == 0) {
         str = word.substring(word.length()/2-1, word.length()/2+1);
      }
      return str;
   }
}