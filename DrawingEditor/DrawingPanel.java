import java.awt.geom.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class DrawingPanel extends JPanel
{
    private MouseListener ml;
    private MouseMotionListener mml;
    private KeyListener kl;

    private Color backgroundColor;
    private Color drawingColor;

    private ArrayList<Shape> shapes;
    private Shape activeShape;

    private boolean isMoving;
    private boolean isStretching;
    private boolean selected;

    private Point2D.Double startClicked;
    
    private double x_1;
    private double y_1;

    public DrawingPanel()
    {
        backgroundColor = Color.WHITE;
        drawingColor = Color.BLUE;
        setBackground(backgroundColor);
        ml = new MouseEvents();
        mml = new MouseMotionEvents();
        kl = new KeyEvents();

        this.addMouseListener(ml);
        this.addMouseMotionListener(mml);
        this.addKeyListener(kl);

        shapes = new ArrayList<Shape>();
        activeShape = new Circle();
    }

    public void pickColor()
    {
        //pass;
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

    
    public class MouseEvents implements MouseListener
    {

        public MouseEvents()
        {}

        public void mouseClicked(MouseEvent e)
        {
            startClicked = new Point2D.Double(e.getX(), e.getY());
            x_1 = e.getXOnScreen();
            y_1 = e.getYOnScreen();
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
    }
    public class MouseMotionEvents implements MouseMotionListener
    {
        public MouseMotionEvents()
        {};

        public void mouseDragged(MouseEvent e)
        {
            double deltax = e.getXOnScreen()-x_1;
            double deltay = e.getYOnScreen()-y_1;
            activeShape.move(deltax, deltay);
            repaint();
        }

        public void mouseMoved(MouseEvent e){}
    }

    public class KeyEvents implements KeyListener
    {
        public KeyEvents()
        {};

        public void keyPressed(KeyEvent e){}

        public void keyReleased(KeyEvent e){}

        public void keyTyped(KeyEvent e){}
    }

}