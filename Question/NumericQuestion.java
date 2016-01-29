public class NumericQuestion extends Question
{
    private double answer;
    public NumericQuestion()
    {
        super();
        this.answer = Double.parseDouble(super.getAnswer());
    }
    
    //overriding
    /**
     * @param response the response to check, expected to be able to be parsed to Double
     * @return true if the response was correct, false otherwise
     */
    public boolean checkAnswer(String response)
    {
        if (Math.abs(answer-Double.parseDouble(response))<0.01)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    //overloading
    public void setAnswer(Double correctResponse)
    {
        this.answer = correctResponse;
    }
    
    
}