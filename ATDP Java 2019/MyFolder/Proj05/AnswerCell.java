
/**
 * Write a description of class AnswerCell here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnswerCell
{
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
      if (isAsleep) {
        return false;
      }
      if (isMorning && !isMom){
        return false;
      }
      return true;
    }

}
