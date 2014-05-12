package ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.Dimension;

public class PartieGauche extends JPanel
{

    public PartieGauche()
    {
        JPanel north = new JPanel();
        north.setBackground(Color.GREEN);
        
        JPanel center = new JPanel();
        center.setBackground(Color.YELLOW);
        
        JPanel south = new JPanel();
        south.setBackground(Color.BLACK);
        

        this.setLayout(new BorderLayout());

        this.add(north, BorderLayout.NORTH);

        this.add(center, BorderLayout.CENTER);

        this.add(south, BorderLayout.SOUTH);
    }
}
