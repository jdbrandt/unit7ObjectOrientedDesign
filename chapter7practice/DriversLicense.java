import java.util.*;
public class DriversLicense extends Card
{
    
    private int driversLi;
    
    public DriversLicense(String n, int driversLi)
    {
        super(n);
        this.driversLi = driversLi;
    }
    
    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        if (calendar.get(Calendar.YEAR)<driversLi)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    
    public String format()
    {
        return "Card holder: "+super.getName()+"\n Driver's License :"+ this.driversLi;
    }
}
