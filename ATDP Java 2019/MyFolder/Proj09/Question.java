import java.util.Scanner;
/**
 * This class represents one question, which includes
 * the texts for the question and answer.
 * 
 * @author Horstmann Book
 * @version 1.0
 */
public class Question {
    // Fields
    private String text;
    private String answer;
    
    // Constructor
    public Question() {
        text = "";
        answer = "";
    }
    
    /**
      Sets the question text.
      @param questionText the text of this question
   */
   public void setText(String questionText) {
      text = questionText;
   }

   /**
      Sets the answer for this question.
      @param correctResponse the answer
   */
   public void setAnswer(String correctResponse) {
      answer = correctResponse;
   }

   /**
      Checks a given response for correctness.
      @param response the response to check
      @return true if the response was correct, false otherwise
   */
   public boolean checkAnswer(String response) {
      return response.equals(answer); //response.equals is a boolean itself
   }

   /**
      Returns the text for the question (without the answer).
      @return the text for the question
   */
   public void display() {
      System.out.println(text);
   }
   
   public static void presentQuestion (Question q){
      System.out.println();
      q.display();
      System.out.print("Your answer: ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
      if (q.checkAnswer(response)) {
          System.out.println("Good job!");
          System.out.println("Keep it up!!");
        }
        else {
          System.out.println("Incorrect");
          System.out.println("Never give up!");
        }
    }
}
