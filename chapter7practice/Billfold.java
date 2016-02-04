public class Billfold
{
    private Card card1;
    private Card card2;
    
    public Billfold()
    {
        ;
    }
    
    public Billfold(Card card1)
    {
        this.card1 = card1;
    }
    
    public Billfold(Card card1, Card card2)
    {
        this.card1 = card1;
        this.card2 = card2;
    }
    
    public void addCard(Card card)
    {
        if (this.card1 == null)
        {
            this.card1 = card;
        }
        else if (this.card2 == null)
        {
            this.card2 = card;
        }
    }
    
    public Card getCard1()
    {
        return this.card1;
    }
    
    public Card getCard2()
    {
        return this.card2;
    }
    
    public String formatCard()
    {
        if (this.card1 == null)
        {
            return "[null|null]";
        }
        else if (this.card2 == null)
        {
            return "["+this.card1.format()+"|null]";
        }
        else
        {
            return "["+this.card1.format()+"|"+this.card2.format()+"]";
        }
    }
}
