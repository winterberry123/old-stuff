import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class AppointmentTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AppointmentTester
{
    public static void main(String [] args){
        ArrayList <Appointment> appointments = new ArrayList <Appointment> ();
        Scanner in = new Scanner (System.in);
        
        while (true){
        System.out.print("Appointments: (F)ind, (A)dd, or (Q)uit: ");
        String a1 = in.nextLine();
        
        if (a1.equals( "A") || a1.equals( "a"))
        {
            System.out.print ("Enter type [(D)aily, (M)onthly, (O)netime]: ");
            String a2 = in.nextLine();
            
            
            if (a2.equals("D") || a2.equals("d")){
                System.out.print("Enter description: ");
                String a3 = in.nextLine();
                Appointment newApp = new Daily (a3);
                appointments.add(newApp);
            }
            else if (a2.equals("M") || a2.equals("m")){
                System.out.print("Enter description: ");
                String a3 = in.nextLine();
                System.out.print ("Enter day: ");
                int day = in.nextInt();
                Appointment newApp = new Monthly (a3, day);
                appointments.add(newApp);
            }
            else {
                System.out.print("Enter description: ");
                String a3 = in.nextLine();
                System.out.print ("Enter month: ");
                int month = in.nextInt();
                System.out.print ("Enter day: ");
                int day = in.nextInt();
                System.out.print ("Enter year: ");
                int year = in.nextInt();
                Appointment newApp = new Onetime (a3, year, month, day);
                appointments.add(newApp);
            }
        }
        
        else if (a1.equals( "F") || a1.equals( "f")){
            System.out.print ("Enter a date (like 7 29 2016) to search: ");
            int a4 = in.nextInt();
            int a5 = in.nextInt();
            int a6 = in.nextInt();
            System.out.println();
            //System.out.println ("Your appointments on " + a4.substring (0,2) + "/" + a4.substring (3,5) + "/" + a4.substring (6,9) + ":");
            System.out.println("Your appointments on " + a4 + "/" + a5 + "/" + a6 + ":");
            for (int i = 0; i < appointments.size(); i++){
                if (appointments.get(i).occursOn(a4,a5,a6)){
                System.out.println (appointments.get(i).toString());
               }
            }
         
        }
        else if (a1.equals( "Q") || a1.equals( "q")){
            System.out.println("Bye");
            break;
        }
    }
  }
}
