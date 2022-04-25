import java.util.Scanner;

/**
   Computes a sum of odd integers between two bounds. 
   Input: a, the lower bound (may be odd or even).
   Input: b, the upper bound (may be odd or even).
   Output: sum of odd integers between a and b (inclusive).
*/
public class OddSum
{
   public static void main(String[] args)
   {
      // Read values for a and b
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int sum = 0;
      for (; a <= b; a++){
         if (a % 2 == 1 || a % 2 == -1){
            sum = sum + a;
         }
         else {
            sum = sum + 0;
         }
      }
      System.out.println(sum);
   }
}