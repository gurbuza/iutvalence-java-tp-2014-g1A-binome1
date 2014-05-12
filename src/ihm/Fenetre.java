package ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.Dimension;

public class Fenetre extends JFrame
{
    
    
    public Fenetre()
    {
        this.setTitle("Echecs");
        this.setLocationRelativeTo(null);
        this.setSize(1000, 700);
        
        PartieGauche gauche = new PartieGauche();
        
        gauche.setPreferredSize(new Dimension(700,700));
        JPanel droite = new JPanel();
        droite.setBackground(Color.RED);
        droite.setPreferredSize(new Dimension(300,700));
        
        this.getContentPane().setLayout(new BorderLayout());

        this.getContentPane().add(gauche, BorderLayout.WEST);
        
        
        this.getContentPane().add(droite, BorderLayout.EAST);

        this.setVisible(true);
    }
}