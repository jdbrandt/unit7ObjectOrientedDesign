

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class BillfoldTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BillfoldTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class BillfoldTest
     */
    public BillfoldTest()
    {
       ;
    }

    public void testNullCards()
    {
        Billfold wallet = new Billfold();
        assertEquals("[null]", wallet.formatCard());
    }
    
    public void testOneCard()
    {
        Billfold wallet = new Billfold(new Card());
        assertEquals("["+wallet.getCard1().format()+"|null]", wallet.formatCard());
    }
    
    public void testTwoCards()
    {
        Billfold wallet = new Billfold(new Card(), new Card());
        assertEquals("["+wallet.getCard1().format()+"|"+wallet.getCard2().format()+"]", wallet.formatCard());
    }
}
