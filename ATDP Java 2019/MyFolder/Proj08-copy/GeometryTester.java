
/**
 * Write a description of class GeometryTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GeometryTester
{
   public static void main (String [] args){
       Cube cube = new Cube (3);
       System.out.println (cube.getVolume());
       System.out.println (cube.getSurface());
       Sphere sphere = new Sphere (3);
       System.out.println (sphere.getVolume());
       System.out.println (sphere.getSurface());
       Cylinder c = new Cylinder (3,5);
       System.out.println (c.getVolume());
       System.out.println (c.getSurface());
       Cone cone = new Cone (3,5);
       System.out.println (cone.getVolume());
       System.out.println (cone.getSurface());
    }
}
