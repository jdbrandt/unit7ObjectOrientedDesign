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

    
    public DrawingPanel()
    {
        backgroundColor = Color.WHITE;
        drawingColor = Color.BLUE;

        ml = new MouseEvents();
        mml = new MouseMotionEvents();
        kl = new KeyEvents();

        this.addMouseListener(ml);
        this.addMouseMotionListener(mml);
        this.addKeyListener(kl);

        shapes = new ArrayList<Shape>();
    }

    
    public class MouseEvents implements MouseListener
    {

        public MouseEvents()
        {}

        public void mouseClicked(MouseEvent e)
        {}

        public void mouseEntered(MouseEvent e){}

        public void mouseExited(MouseEvent e){}

        public void mousePressed(MouseEvent e){}

        public void mouseReleased(MouseEvent e){}
    }

    public class MouseMotionEvents implements MouseMotionListener
    {
        public MouseMotionEvents()
        {};

        public void mouseDragged(MouseEvent e){}

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