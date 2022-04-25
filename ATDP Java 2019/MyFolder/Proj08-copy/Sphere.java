
/**
 * Write a description of class Geometry02 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sphere
{
    private double radius;
    
    public Sphere (double givenRadius) {
        radius = givenRadius;
    }
    
    public double getVolume(){
        return 4.0/3 * Math.PI * Math.pow (radius, 3);
    }
    
    public double getSurface(){
       return 4 * Math.PI * Math.pow (radius,2);
    }
}
