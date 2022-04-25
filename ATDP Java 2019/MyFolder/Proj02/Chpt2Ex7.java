public class Chpt2Ex7
{
      public static String HollePrinter(String original) {
          original = original.replace("e", "b");
          original = original.replace("o", "e");
          original = original.replace ("b", "o");
          return original;
        }
        public static void main(String[] args)
  {
      System.out.println (HollePrinter("Hello World!"));
    }}