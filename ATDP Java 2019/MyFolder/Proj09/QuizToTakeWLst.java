import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class QuizToTakeWLst here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuizToTakeWLst 
{
  
    
    public static void main(String []args){
       ArrayList <Question> questions = new ArrayList <Question> ();
       Question q = new Question ();
       q.setText("Who was the first president of the US?");
       q.setAnswer("George Washington");
       questions.add(q);
       
       Question q1 = new Question ();
       q1.setText("Who was the second president of the US?");
       q1.setAnswer("John Adams");
       questions.add(q1);
       
       Question q2 = new Question ();
       q2.setText("Who was the third president of the US?");
       q2.setAnswer("Thomas Jefferson");
       questions.add(q2);
       
       for (int i = 0; i < questions.size(); i++){
           Question.presentQuestion(questions.get(i));
        }
    }
    
   
}
