import java.awt.geom.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class DrawingPanel extends JPanel
{
    private AllListener l;

    private Color backgroundColor;
    private Color drawingColor;

    private ArrayList<Shape> shapes;
    private Shape activeShape;

    private boolean isMoving;
    private boolean isStretching;
    private boolean selected;
    
    private JPanel color;



    public DrawingPanel()
    {
        backgroundColor = Color.WHITE;
        drawingColor = Color.BLUE;
        setBackground(backgroundColor);

        l = new AllListener();
        
        this.addMouseListener(l);
        this.addMouseMotionListener(l);
        this.addKeyListener(l);

        shapes = new ArrayList<Shape>();
        activeShape = new Circle();
    }
    
    public void setColor(Color color)
    {
        drawingColor = color;
    }
    
    public void pickColor()
    {
        setColor(JColorChooser.showDialog(this, "Pick a color", drawingColor));
        repaint();
        color.setBackground(drawingColor);
    }

    public void  addCircle()
    {
        Circle c = new Circle();
        c.setCenter(300,300);
        c.setRadius(50);
        activeShape = c;
        shapes.add(c);
        repaint();
    }

    public void addSquare()
    {
        Square s = new Square();
        s.setCenter(300,300);
        s.setRadius(50);
        activeShape = s;
        shapes.add(s);
        repaint();
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        for (int i = shapes.size()-1; i >= 0; i--)
        {
            if (!shapes.get(i).equals(activeShape))
            {
                shapes.get(i).draw(g2,true);
            }
        }
        activeShape.draw(g2,false);
    }

    
    public class AllListener implements MouseListener, MouseMotionListener, KeyListener
    {
        
        Point2D.Double startClicked;
        Point2D.Double startClickedOnScreen;
        
        
        public AllListener()
        {}

        
        
        public void mouseClicked(MouseEvent e)
        {
            startClicked = new Point2D.Double(e.getX(), e.getY());
            startClickedOnScreen = new Point2D.Double(e.getXOnScreen(), e.getYOnScreen());
            boolean isActiveShape = false;

            if (activeShape.isInside(startClicked) || activeShape.isOnBorder(startClicked))
            {
                isActiveShape = true;
            }

            if (!isActiveShape)
            {
                for (int i = shapes.size()-1; i >= 0; i--)
                {
                    if (shapes.get(i).isInside(startClicked) || shapes.get(i).isOnBorder(startClicked))
                    {
                        activeShape = shapes.get(i);
                    }
                }
            }
            repaint();
        }

        public void mouseEntered(MouseEvent e){}

        public void mouseExited(MouseEvent e){}

        public void mousePressed(MouseEvent e){}

        public void mouseReleased(MouseEvent e){}

        public void mouseDragged(MouseEvent e)
        {
            double deltax = (e.getXOnScreen()-startClickedOnScreen.getX())/50;
            double deltay = (e.getYOnScreen()-startClickedOnScreen.getY())/50;
            activeShape.move(deltax, deltay);
            repaint();
        }

        public void mouseMoved(MouseEvent e){}


        public void keyPressed(KeyEvent e){}

        public void keyReleased(KeyEvent e){}

        public void keyTyped(KeyEvent e){}
    }

}