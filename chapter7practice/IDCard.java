public class IDCard extends Card
{
    private String iDNum;

    public IDCard()
    {
        super();
        iDNum = "";
    }

    public IDCard(String n)
    {
        super(n);
        iDNum = "";
    }

    public IDCard(String n, String iD)
    {
        super(n);
        iDNum = iD;
    }

    public String format()
    {
        return "Card holder: " + super.getName() + "\n" + "ID Number: " + iDNum;
    }

    public String getID()
    {
        return this.iDNum;
    }

    //overrides equals in Card & Object
    public boolean equals(Object other)
    {
        if (this.getClass() == other.getClass())
        {
            boolean isEqual = super.equals(other);
            IDCard otherIDCard = (IDCard) other;
            return isEqual && this.iDNum.equals(otherIDCard.iDNum);
        }
        return false;
    }

}
        