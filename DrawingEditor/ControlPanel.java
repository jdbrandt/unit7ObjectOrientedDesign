//check check checkitty check

import java.awt.geom.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ControlPanel extends JPanel
{
    private JButton pick;
    private JButton addCircle;
    private JButton addSquare;
    private JPanel colorShower;
    private DrawingPanel canvas;

    public ControlPanel(DrawingPanel dp)
    {
        canvas = dp;

        pick = new JButton("Pick Color");
        addCircle = new JButton("Add Circle");
        addSquare = new JButton("Add Square");
        colorShower = new JPanel();

        add(pick);
        add(addCircle);
        add(addSquare);
        add(colorShower);

        pick.addActionListener(new ClickListener());
        addCircle.addActionListener(new ClickListener());
        addSquare.addActionListener(new ClickListener());

    }

    public class ClickListener implements ActionListener
    {

        public ClickListener()
        {
        }

        public void actionPerformed(ActionEvent event)
        {
            if (event.getActionCommand().equals("Pick Color"))
            {
                canvas.pickColor();
            }
            else if (event.getActionCommand().equals("Add Circle"))
            {
                canvas.addCircle();
            }
            else if (event.getActionCommand().equals("Add Square"))
            {
                canvas.addSquare();
            }
        }
    }
}

    