import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class TriangleGUIComponent extends JComponent
{
    
    
    private static final double R = 12;
    
    private Line2D.Double line1;
    private Line2D.Double line2;
    private Line2D.Double line3;
    
    private Point point1;
    private Point point2;
    private Point point3;
    
    private Ellipse2D.Double ellipse1;
    private Ellipse2D.Double ellipse2;
    private Ellipse2D.Double ellipse3;
    
    
    public TriangleGUIComponent()
    {
        line1 = new Line2D.Double();
        line2 = new Line2D.Double();
        line3 = new Line2D.Double();
        point1 = new Point();
        point2 = new Point();
        point3 = new Point();
        ellipse1 = new Ellipse2D.Double();
        ellipse2 = new Ellipse2D.Double();
        ellipse3 = new Ellipse2D.Double();
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(line1);
        g2.draw(line2);
        g2.draw(line3);
        g2.draw(ellipse1);
        g2.draw(ellipse2);
        g2.draw(ellipse3);
    }
    
    public void setPoint1(double x, double y)
    {
        point1.setLocation(x,y);
        ellipse1.setFrame(x-R, y-R, 2*R, 2*R);
        repaint();
    }
    
    public void setPoint2(double x, double y)
    {
        point2.setLocation(x,y);
        ellipse2.setFrame(x-R, y-R, 2*R, 2*R);
        line1.setLine(point1.getX(), point1.getY(), x, y);
        repaint();
    }
    
    public void setPoint3(double x, double y)
    {
        point3.setLocation(x,y);
        ellipse3.setFrame(x-R, y-R, 2*R, 2*R);
        line2.setLine(point2.getX(), point2.getY(), x, y);
        line3.setLine(x, y, point1.getX(), point1.getY());
        repaint();
    }
    
    public void clear()
    {
        point1.setLocation(0,0);
        point2.setLocation(0,0);
        point3.setLocation(0,0);
        line1.setLine(0,0,0,0);
        line2.setLine(0,0,0,0);
        line3.setLine(0,0,0,0);
        ellipse1.setFrame(0,0,0,0);
        ellipse2.setFrame(0,0,0,0);
        ellipse3.setFrame(0,0,0,0);
        repaint();
    }
    
    
}
    
    