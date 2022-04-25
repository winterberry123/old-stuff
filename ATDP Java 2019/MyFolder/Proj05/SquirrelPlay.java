public class SquirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer) {
      if (isSummer==true){
        if (temp <= 100 && temp >= 60) {
          return true;
        }
        else{
          return false;
        }
      }
      else{
        if (temp <= 90 && temp >= 60){
        return true;
        }
        else {
          return false;
        }
      }
    }
}