
/**
 * Write a description of class Geometry02 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cone
{
    private double height;
    private double radius;
    
    public Cone (double givenHeight, double givenRadius) {
        height = givenHeight;
        radius = givenRadius;
    }
    
    public double getVolume(){
        return Math.PI * radius * radius * (height / 3);
    }
    
    public double getSurface(){
       return Math.PI * radius * (radius + Math.sqrt(height*height + radius*radius));
    }
}
