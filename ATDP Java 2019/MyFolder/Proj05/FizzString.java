
/**
 * Write a description of class FizzString here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FizzString
{
    public String fizzString(String str) {
      if (str.substring(0,1).equals("f") && str.substring(str.length()-1).equals("b")){
        return "FizzBuzz";
      }
      else if (str.substring(0,1).equals("f")){
        return "Fizz";
      }
      else if (str.substring(str.length()-1).equals("b")){
        return "Buzz";
      }
      return str;
    }

}
