public class EvenBetterRectangle extends java.awt.Rectangle
{
    
    public EvenBetterRectangle(int height, int width)
    {
        super(height, width);
    }
    
    public double getArea()
    {
        return super.getHeight()*super.getWidth();
    }
    
    public double getPerimeter()
    {
        return super.getHeight()*2+super.getWidth()*2;
    }
    
        
}
