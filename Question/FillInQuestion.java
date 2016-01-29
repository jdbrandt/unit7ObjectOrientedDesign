import java.util.*;

public class FillInQuestion extends Question
{
    /*
     * This class supports fill-in-the-blank questions whre teh answer is specified in the question's text.
     * For example:
     * text: "The inventor of Java was _James Gosling_"
     * 
     * This will extract the answer from the question's text and replace the answer with ________
     */
    public FillInQuestion()
    {
        super();
    }
    
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        
        
        String question = parser.next();
        String answer = parser.next();
        question+= "_______" + parser.next();
        
        //prevents SOE
        super.setText(question);
        this.setAnswer(answer);
    }
    
    
    
}