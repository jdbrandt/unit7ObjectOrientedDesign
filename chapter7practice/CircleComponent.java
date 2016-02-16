import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class CircleComponent extends JComponent
{
    private static final double CENTER_R = 2;
    
    private Ellipse2D.Double circle;
    private Ellipse2D.Double center;
    
    
    public CircleComponent()
    {
        circle = new Ellipse2D.Double();
        center = new Ellipse2D.Double(0, 0, CENTER_R, CENTER_R);
        
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        g2.draw(circle);
        g2.draw(center);
        g2.fill(center);
    }
    
    public void setRadius(double radius)
    {
        circle.setFrame(circle.getX()-radius, circle.getY()-radius, 2*radius, 2*radius);
        repaint();
    }
    
    public void setCenter(double x, double y)
    {
        center.setFrame(x-CENTER_R, y-CENTER_R, 2*CENTER_R, 2*CENTER_R);
        circle.setFrame(x-circle.getWidth(), y-circle.getWidth(), 2*circle.getWidth(), 2*circle.getHeight());
        repaint();
    }
    
    public void setX(double x)
    {
        center.setFrame(x-CENTER_R, center.getY()-CENTER_R, 2*CENTER_R, 2*CENTER_R);
        circle.setFrame(x-CENTER_R, circle.getY()-CENTER_R, 2*CENTER_R, 2*CENTER_R);
        repaint();
    
    }
    
    public void setY(double y)
    {
        center.setFrame(center.getX()-CENTER_R, y-CENTER_R, 2*CENTER_R, 2*CENTER_R);
        circle.setFrame(circle.getX()-circle.getWidth(), y-circle.getWidth(), 2*circle.getWidth(), 2*circle.getHeight());
        repaint();
    }
    
    public void clear()
    {
        center.setFrame(0,0,0,0);
        circle.setFrame(0,0,0,0);
        repaint();
    }
    
}
    
    