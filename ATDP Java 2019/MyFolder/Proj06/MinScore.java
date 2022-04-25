import java.util.Scanner;
/**
 * Write a description of class MinScore here.
 *
 * @author (your name)
 * @version (a version number or a date)1
 */
public class MinScore
{
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        System.out.print ("Enter a number: ");
        int count = 0;
        int minVal = 0;
        int maxVal = 0;
       while (in.hasNextInt()){
        
        int curVal = in.nextInt();
        
        if (count == 0) {
            minVal = curVal;
            maxVal = curVal;
        }
        else if (curVal < minVal) {
            minVal = curVal;
            count++;
        }
        else if (curVal > maxVal) {
            maxVal = curVal;
            count++;
        }
        
        System.out.println ("The minimum value is " + minVal);
        System.out.println ("The maximum value is " + maxVal);
        count++;
        System.out.print("Enter a number: ");
    }
    System.out.println("Bye");
}
}
