import java.util.Scanner;
/**
 * Write a description of class Ex8_6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Geometry
{
    public static double cubeVolume(double h){
        return Math.pow(h, 3);
    }
    public static double cubeSurface(double h){
        return h*h*6;
    }
    public static double sphereVolume(double r){
     return 4.0/3 * Math.PI * Math.pow (r, 3);
    }
    public static double sphereSurface(double r){
        return 4 * Math.PI * Math.pow (r,2);
    }
    public static double cylinderVolume(double r, double h){
        return r * r * Math.PI * h;
    }
    public static double cylinderSurface(double r, double h){
        return  r * 2 * Math.PI * h;
    }
    public static double coneVolume(double r, double h){
        return Math.PI * r * r * (h / 3);
    }
    public static double coneSurface(double r, double h){
        return Math.PI * r * (r + Math.sqrt(h*h + r*r));
    }

    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a radius: ");
        double r1 = in.nextDouble();
        System.out.println();
        System.out.print("Enter a height: ");
        double h1 = in.nextDouble();
        System.out.println("The cube volume is: " + Geometry.cubeVolume(h1));
        System.out.println("The cube surface area is: " + Geometry.cubeSurface(h1));
        System.out.println("The sphere volume is: " + Geometry.sphereVolume(r1));
        System.out.println("The sphere surface area is: " + Geometry.sphereSurface(r1));
        System.out.println("The cylinder volume is: " + Geometry.cylinderVolume(r1,h1));
        System.out.println("The cylinder surface area is: " + Geometry.cylinderSurface(r1,h1));
        System.out.println("The cone volume is: " + Geometry.coneVolume(r1,h1));
        System.out.println("The cone volume is: " + Geometry.coneSurface(r1,h1));
    }
}