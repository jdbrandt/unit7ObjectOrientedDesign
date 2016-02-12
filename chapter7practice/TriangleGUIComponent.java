import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class TriangleGUIComponent extends JComponent
{
    
    
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
    }
    
    public void setLine1(int x1, int y1, int x2, int y2)
    {
        line1.setLine(x1, y1, x2, y2);
        repaint();
    }
    
    public void setLine2(int x1, int y1, int x2, int y2)
    {
        line2.setLine(x1, y1, x2, y2);
        repaint();
    }
    
    public void setLine3(int x1, int y1, int x2, int y2)
    {
        line3.setLine(x1, y1, x2, y2);
        repaint();
    }
    
}
    
    