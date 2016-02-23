import java.awt.geom.*;
import java.awt.*;
import javax.swing.*;


public class DrawingEditor extends JFrame
{
    private DrawingPanel canvas;
    private ControlPanel controls;
    private Container pane;
    
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 600;
    
    public DrawingEditor()
    {
        Container pane = this.getContentPane();
        
        DrawingPanel canvas = new DrawingPanel();
        ControlPanel controls = new ControlPanel(canvas);
        
        pane.add(canvas, BorderLayout.CENTER);
        pane.add(controls, BorderLayout.SOUTH);
    }
    
    public static void main(String[] args)
    {
        DrawingEditor de = new DrawingEditor();
        
        de.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        de.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        de.setVisible(true);
    }
    
}
        