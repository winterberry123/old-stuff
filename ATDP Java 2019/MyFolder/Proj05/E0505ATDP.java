import java.util.Random;


public class E0505ATDP
{
   /**
    * Given a number n, randomly generate an integer in the range
    * from -n to n.
    * @param maxAbs the maximum absolute value of the resulting value
    * @return an integer in the range from -maxAbs to maxAbs
    */
   public static int getRandomInt(int maxAbs) {
       int n = (int) Math.round((Math.random() * (maxAbs)));
       if (Math.random() < .5) {
           n = -n;
        }
        return n;
   }
    
   public static void main(String[] args)
   {
       // Generate 3 random integers
       int i = getRandomInt(5);
       int j = getRandomInt(5);
       int k = getRandomInt(5);
       
       System.out.printf("The three numbers are %d, %d, %d\n", i, j, k);
       
       if (i > j) {
           if (j > k){
                System.out.println ("decreasing");
            }
            else {
                System.out.println ("neither");
            }
        }
       else if (i < j){
           if (j < k) {
               System.out.println ("increasing");}
           else {
               System.out.println ("neither");}
       }
       else {
            System.out.println ("neither");}
    }
}