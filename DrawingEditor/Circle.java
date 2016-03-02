import java.awt.*;
import java.awt.geom.*;

public class Circle extends Shape
{
    public Circle()
    {
        center = new Point2D.Double(0,0);
        radius = 0;
        color = color.WHITE;
    }
    
    public Point2D.Double getCenter()
    {
        return center;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public void move(double x, double y)
    {
        center = new Point2D.Double(center.getX()+x, center.getY()+y);
    }
    
    public void setRadius(double x)
    {
        radius = x;
    }
    
    public void setCenter(Point2D.Double point)
    {
        center = point;
    }
    
    public void setCenter(double x, double y)
    {
        center = new Point2D.Double(x,y);
    }
    
    
    public boolean isInside(Point2D.Double point)
    {
        return true ? center.distance(point)<radius : false;
    }
    
    public boolean isOnBorder(Point2D.Double point)
    {
        return true ? center.distance(point)==radius : false;
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        g2.drawOval((int)(center.getX()-radius), (int)(center.getY()-radius), (int)(2*radius), (int)(2*radius));
        if (filled)
        {
            g2.fillOval((int)(center.getX()-radius), (int)(center.getY()-radius), (int)(2*radius), (int)(2*radius));
        }
    }
    
}