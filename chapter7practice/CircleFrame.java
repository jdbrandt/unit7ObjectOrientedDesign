import java.awt.event.*;
import javax.swing.*;

public class CircleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 600;

    private CircleComponent scene;
    
    public CircleFrame()
    {
        scene = new CircleComponent();
        add(scene);
        
        MouseListener mPL = new MousePressListener();
        
        scene.addMouseListener(mPL);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    public void update(double x, double y, double radius)
    {
        scene.setCenter(x,y);
        scene.setRadius(radius);
    }
    
    public void update(double radius)
    {
        scene.setRadius(radius);
    }
    
    class MousePressListener implements MouseListener
    {
        private int clicks;
        
        
        public MousePressListener()
        {
            clicks = 0;
        }
        
        public void mousePressed(MouseEvent event)
        {
            clicks++;
            
            if (clicks == 1)
            {
                scene.setCenter(event.getX(), event.getY());
            }
            else if (clicks == 2)
            {
                clicks = 0;
                scene.clear();
            }
        }
        
        public void mouseReleased(MouseEvent event) {};
        public void mouseClicked(MouseEvent event) {};
        public void mouseEntered(MouseEvent event) {};
        public void mouseExited(MouseEvent event) {};
    }
    

}
