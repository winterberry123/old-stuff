import java.util.Scanner;
/**
 * E4.7
 *
 * @author Joyce Chen
 * @version 01
 */
public class Ex7
{
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        
        System.out.print("Enter a radius: ");
        double radius = in.nextDouble();
        
        double areaOfCircle = Math.PI * Math.pow(radius,2);
        double cirOfCircle = Math.PI * 2 * radius;
        double volOfSphere = 4.0/3 * Math.PI * Math.pow(radius,3);
        double surfOfSphere = Math.PI * 4 * Math.pow(radius, 3); //got wrong should be (radius,2)
        
        System.out.printf("Area of circle: %.2f", areaOfCircle);
        System.out.println();
        System.out.printf("Circumference of circle: %.2f", cirOfCircle);
        System.out.println();
        System.out.printf("Volume of sphere: %.2f", volOfSphere);
        System.out.println();
        System.out.printf("Surface area of sphere: %.2f", surfOfSphere);
    }
}
