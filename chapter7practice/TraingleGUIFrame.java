import java.awt.event.*;
import javax.swing.*;

public class TraingleGUIFrame extends JFrame
{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 600;
    
    private TriangleGUIComponent scene;
    
    class MousePressListener implements MouseListener
    {
        private int clicks;
        
        private int x1, y1, x2, y2, x3, y3;
        
        public MousePressListener()
        {
            clicks = 0;
        }
        
        public void mousePressed(MouseEvent event)
        {
            clicks++;
            
            if (clicks == 1)
            {
                x1 = event.getX();
                y1 = event.getX();
            }
            
            else if (clicks == 2)
            {
                x2 = event.getX();
                y2 = event.getY();
                
            }
            else if (clicks == 3)
            {
                x3 = event.getX();
                y3 = event.getY();
            }
            else if (clicks == 4)
            {
                clicks = 0;
                x1 = 0; y1 = 0; x2 = 0; y2 = 0; x3 = 0; y3 = 0;
            
            }
        }
        
    }
}

            