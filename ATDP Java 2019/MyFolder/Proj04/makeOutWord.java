
/**
 * Write a description of class makeOutWord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class makeOutWord
{
        public String makeOutWord(String out, String word) {
            String output = out.substring(0,2) + word + out.substring (2,4);
            return output;
        }
}

