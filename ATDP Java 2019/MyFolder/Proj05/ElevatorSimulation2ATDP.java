import java.util.Scanner;

/**
   This program simulates an elevator panel that skips the 13th floor, checking for 
   input errors.
*/
public class ElevatorSimulation2ATDP
{
   public static void main(String[] args)
   {  
      Scanner kBoard = new Scanner(System.in);
      System.out.print("Which floor do you want to go to? (1-20, except 13): ");
      String str = null;
      int actualFloor = 0;
      if (kBoard.hasNextInt()) // i.e., user entered an integer 
      {
         int reqFloor = kBoard.nextInt();
         if (reqFloor < 13) {
             actualFloor = reqFloor;
            }
         else if (reqFloor > 13) {
             actualFloor = reqFloor-1;
            }
         System.out.println ("Actual floor: " + actualFloor);
        }
      else // i.e., the user did not enter an integer
      {
          str = "Error, enter an integer.";
          System.out.println (str);
      }
   }
}
