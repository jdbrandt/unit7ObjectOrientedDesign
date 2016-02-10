import javax.swing.*;
import java.awt.event.*;


public class ButtonViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 100;

    private JPanel panel;
    private JFrame frame;

    private JButton button;
    private JButton button2;

    private JButton[] buttons;

    private JLabel label;

    public ButtonViewer()
    {
        /**
        this.frame = new JFrame();

        this.panel = new JPanel();

        this.button = new JButton("A");
        this.panel.add(this.button);

        this.button2 = new JButton("B");
        this.panel.add(this.button2);

        this.frame.add(this.panel);

        
        this.button.addActionListener(new ClickListener("A"));
        this.button2.addActionListener(new ClickListener("B"));

        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);

         **/
        buttons = new JButton[2];
        frame = new JFrame();
        panel = new JPanel();

        for (int i = 0; i < buttons.length; i++)
        {
            buttons[i] = new JButton(Integer.toString(i));
            panel.add(buttons[i]);
            buttons[i].addActionListener(new ClickListener());
        }

        label = new JLabel();
        panel.add(label);

        frame.add(this.panel);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    
    
    public static void main(String[] args)
    {

    }
    
    
    public class ClickListener implements ActionListener
    {

        public ClickListener()
        {
        }

        public void actionPerformed(ActionEvent event)
        {
            label.setText("Button "+event.getActionCommand()+" was clicked!");
        }
    }

    
}
