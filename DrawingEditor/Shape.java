import java.awt.geom.Point2D;
import java.awt.*;


public abstract class Shape
{
    protected Point2D.Double center;
    protected double radius;
    protected Color color;
    
    public abstract Point2D.Double getCenter();
    public abstract double getRadius();
    public abstract void move(double x, double y);
    public abstract void setRadius(double r);
    public abstract void setCenter(Point2D.Double p);
    public abstract void setCenter(double x, double y);
    public abstract boolean isInside(Point2D.Double point);
    public abstract boolean isOnBorder(Point2D.Double point);
    public abstract void draw(Graphics2D g2, boolean filled);
}
