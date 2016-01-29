

public class ChoiceQuestion extends Question
{
    private int choices;
    
    public ChoiceQuestion()
    {
        super();
        choices = 0;
    }
    
    public void addChoice( String choice, boolean correct )
    {
        choices++;
        this.addText("\n"+ choices+") "+choice);
        
        if (correct)
        {
            this.setAnswer(choices+"");
        }
    }
    
}
