import java.util.Arrays;
/**
 * Write a description of class ArrayIDChecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayIDChecker
{
    public static void main(String [] args){
        int [] temps = new int [12];
        
        for (int i = 0; i < 12; i++){
         int x = (int) (Math.random() * 110) -20;
         System.out.println (x);
         temps[i] = x;
        }
        for (int i = 0; i < temps.length; i++){
         System.out.print(temps[i] + " ");   
        }
        
         int t1 = temps[0];
         temps[0] = temps [temps.length-1];
         temps[temps.length-1] = t1;
         System.out.println();
        for (int i = temps.length-1; i >= 0; i--){
         System.out.print(temps[i] + " ");   
        }
        
        int maxVal = 0;
        int minVal = 0;
        int sum = 0;
        for (int i = 0; i < temps.length; i++){
            int curVal = temps [i];
            if (temps[i] > maxVal){
             maxVal = temps[i];
            }
            else if (temps[i] < minVal){
             minVal = temps[i];
            }
            sum = sum + temps[i];
        }
        int average = sum/temps.length;
        System.out.println();
        System.out.println ("Min: " + minVal + " Max: " + maxVal + " Sum: " + sum + " Average: " + average);
         
        Arrays.sort(temps);
        System.out.println (Arrays.binarySearch(temps,temps.length));
        System.out.println (Arrays.toString(temps));
    }

}
