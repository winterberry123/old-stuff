import java.util.ArrayList;
/**
 * Write a description of class ChoiceQuestion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChoiceQuestion extends Question
{
    private ArrayList<String> choices;
    
    /**
     * Constructs a ChoiceQuestion object.
     */
    public ChoiceQuestion() {
        super();
        choices = new ArrayList<String>();
    }
    
    /**
     * Adds a choice to the answer choices.
     * @param newChoice the choice you are adding
     */
    public void addChoice (String newChoice){
        choices.add (newChoice);
    }
    
    /**
     * Displays the question and the answer choices.
     */
    public void display (){
        super.display();
        System.out.println ("1) " + choices.get(0) + "\n2) " + choices.get(1) + "\n3) "+ choices.get(2) + "\n4) " + choices.get(3));
    }
}
