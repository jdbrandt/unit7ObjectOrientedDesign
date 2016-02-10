import java.awt.Rectangle;

public class BetterRectangle
{
    private Rectangle rect;
    
    public BetterRectangle(int x1, int y1, int x2, int y2)
    {
        rect.setLocation(x1, y1);
        rect.setSize(Math.abs(x1-x2), Math.abs(y1-y2));
    }
    
    public double getPerimeter()
    {
        return 2*rect.getHeight()+2*rect.getWidth();
    }
    public double getArea()
    {
        return rect.getHeight()*rect.getWidth();
    }
}
        