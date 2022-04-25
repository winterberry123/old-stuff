import java.util.Scanner;
/**
 * Write a description of class QuizToTake here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuizToTake
{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        Question q1 = new Question();
        
        q1.setText("Who is the CEO of Facebook?");
        q1.display();
        
        String yourAns = in.nextLine();
        q1.setAnswer ("Mark Zuckerberg");
        
        if (q1.checkAnswer(yourAns)){
            System.out.println ("Correct! Great Job :) ");
        }
        else {
            System.out.println ("Incorrect :(  Try again next time.");   
        }
        
        ChoiceQuestion c1 = new ChoiceQuestion();
        
        c1.setText("Who is the CEO of Tesla?");
        c1.addChoice ("Miguel Picart");
        c1.addChoice ("George Washington");
        c1.addChoice ("Elon Musk");
        c1.addChoice ("Shreya Sandrapati");
        c1.display();
        
        String ans = in.nextLine();
        c1.setAnswer ("3");
        
        if (c1.checkAnswer(ans)){
            System.out.println ("Correct! Great Job :) ");
        }
        else {
            System.out.println ("Incorrect :(  Try again next time.");   
        }
    }
}
