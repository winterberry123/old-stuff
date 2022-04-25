
/**
 * Write a description of class FizzString2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FizzString2
{
    public String fizzString2(int n) {
      if (n % 3 == 0 && n % 5 == 0){
        return "FizzBuzz!";
      }
      else if (n % 3 == 0){
        return "Fizz!";
      }
      else if (n % 5 == 0){
        return "Buzz!";
      }
      else {
        return n + "!";
      }
    }

}
