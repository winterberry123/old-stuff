import java.util.Random;
public class DieSimulator
{
     public static void main(String[] args)
   { 
       Random randGen = new Random ();
       int n = randGen.nextInt(6)+1;
       System.out.println (n);
    }}
    