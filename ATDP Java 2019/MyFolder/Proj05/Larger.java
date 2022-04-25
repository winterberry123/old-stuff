import java.util.Scanner;

/** 
   A program reads two integer values
   and prints out the larger of the two.
   If the values are equal, only one of the value is printed.
*/
public class Larger
{
   public static void main(String[] args)
   {
      // Print prompt to enter two integer values
      System.out.print("Please enter two integer values: ");

      // Read in both integer values
      Scanner in = new Scanner(System.in);
      int value1 = in.nextInt();
      int value2 = in.nextInt();

      // Determine which value is larger and print it out
      
      // Your work here
      int larger;
      if (value1 > value2) {
         larger = value1;
      }
      else {
         larger = value2;
      }
      System.out.println(larger);
   }
}