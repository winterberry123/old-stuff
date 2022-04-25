
/**
 * Write a description of class WordsStutter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordsStutter
{
   /**
      Computes a string that repeats every letter 't' in the original string.
      @param s any string
      @return a string with the same characters as s, except that every letter 't' is repeated
   */
   public String stutter(String s)
   {
      String str = "";
      for (int i = 0; i < s.length(); i++) {
         if (s.charAt(i) == 't'){
            str = str + "tt";}
         else {
            str = str + s.substring(i,i+1); }
      }
      return str;
   }
}
