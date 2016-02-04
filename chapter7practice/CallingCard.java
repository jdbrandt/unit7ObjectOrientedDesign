public class CallingCard extends Card
{
    private String cardNum;
    private String pin;
    
    public CallingCard()
    {
        super();
    }
    
    public CallingCard(String n, String cNum, String pin)
    {
        super(n);
        this.cardNum = cNum;
        this.pin = pin;
    }
    
    public String format()
    {
        return "Card holder: "+super.getName()+"\n Card number: "+this.cardNum+"\n PIN: "+this.pin;
    }
}
    
        