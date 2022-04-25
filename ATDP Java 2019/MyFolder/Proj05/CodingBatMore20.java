public class CodingBatMore20 {
    public boolean more20(int n) {
       boolean b = false;
          if (n % 20 > 0 && n % 20 < 3) {
            b = true;
          }
          else if (n % 20 == 0) {
            b = false;
          }
          return b;
}}
