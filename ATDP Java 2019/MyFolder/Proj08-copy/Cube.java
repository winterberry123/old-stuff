
/**
 * Write a description of class Geometry02 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cube
{
    private double height;
    
    public Cube (double givenHeight) {
        height = givenHeight;
    }
    
    public double getVolume(){
        return Math.pow(height, 3);
    }
    
    public double getSurface(){
       return height * height * 6;
    }
}
