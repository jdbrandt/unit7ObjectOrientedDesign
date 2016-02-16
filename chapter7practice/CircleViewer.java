import javax.swing.*;


public class CircleViewer
{
    public static void main(String[] args)
    {
        CircleFrame frame = new CircleFrame();
        JOptionPane option = new JOptionPane();
        

        double radius = Double.parseDouble(option.showInputDialog("Please input the radius of the circle", null));
        
        frame.update(radius);
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
