
/**
 * Write a description of class TeaParty here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TeaParty
{
    public int teaParty(int tea, int candy) {
      if (tea < 5 || candy < 5){
        return 0;
      }
      if ((tea >= candy * 2) || (tea * 2 <= candy)){
        return 2;
      }
      else if (tea >= 5 && candy >= 5){
        return 1;
      }
      return 0;
    }


}
