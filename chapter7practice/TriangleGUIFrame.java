import java.awt.event.*;
import javax.swing.*;

public class TriangleGUIFrame extends JFrame
{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 600;
    
    private TriangleGUIComponent scene;
    
    
    
    public TriangleGUIFrame()
    {
        scene = new TriangleGUIComponent();
        add(scene);
        
        MouseListener listener = new MousePressListener();
        scene.addMouseListener(listener);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
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
                scene.setPoint1(event.getX(), event.getY());
            }
            
            else if (clicks == 2)
            {
                scene.setPoint2(event.getX(), event.getY());
            }
            else if (clicks == 3)
            {
                scene.setPoint3(event.getX(), event.getY());
            }
            else if (clicks == 4)
            {
                scene.clear();
                clicks = 0;
            
            }
        }
        
        public void mouseReleased(MouseEvent event) {};
        public void mouseClicked(MouseEvent event) {};
        public void mouseEntered(MouseEvent event) {};
        public void mouseExited(MouseEvent event) {};
    }
    
    
    
    
    }


            