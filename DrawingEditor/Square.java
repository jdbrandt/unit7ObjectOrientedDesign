import java.awt.*;
import java.awt.geom.*;

public class Square extends Shape
{
    public Square()
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
        if (point.getX()>center.getX()-radius && point.getY()>center.getY()-radius && point.getX()<center.getX()+radius && point.getY() < center.getY()+radius)
        {
            return true;
        }
        return false; 
    }
    
    public boolean isOnBorder(Point2D.Double point)
    {
        if (point.getX()==center.getX()-radius&&point.getY()>=center.getY()-radius&&point.getY()<=center.getY()+radius)
        {
            return true;
        }
        else if(point.getX()==center.getX()+radius&&point.getY()>=center.getY()-radius&&point.getY()<=center.getY()+radius)
        {
            return true;
        }
        else if (point.getY()==center.getY()-radius&&point.getX()>=center.getX()-radius&&point.getX()<=center.getX()+radius)
        {
            return true;
        }
        else if (point.getY()==center.getY()+radius&&point.getX()>=center.getX()-radius&&point.getX()<=center.getX()+radius)
        {
            return true;
        }
        return false;
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        g2.drawRect((int)(center.getX()-radius), (int)(center.getY()-radius), (int)(2*radius), (int)(2*radius));
        if (filled)
        {
            g2.fillRect((int)(center.getX()-radius), (int)(center.getY()-radius), (int)(2*radius), (int)(2*radius));
        }
    }
    
}