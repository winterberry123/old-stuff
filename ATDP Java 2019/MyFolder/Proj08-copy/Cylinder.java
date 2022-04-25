
/**
 * Write a description of class Geometry02 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cylinder
{
    private double height;
    private double radius;
    
    public Cylinder (double givenHeight, double givenRadius) {
        height = givenHeight;
        radius = givenRadius;
    }
    
    public double getVolume(){
        return radius * radius * Math.PI * height;
    }
    
    public double getSurface(){
       return  radius * 2 * Math.PI * height;
    }
}
