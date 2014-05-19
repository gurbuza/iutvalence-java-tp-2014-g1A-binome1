package ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.awt.Dimension;

public class Fenetre extends JFrame
{

    public Fenetre()
    {
        int i, j;
        this.setTitle("Echecs");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setSize(1000, 700);
        this.setResizable(false);
        JPanel gauche = new JPanel();
        JPanel droite = new JPanel();

        gauche.setPreferredSize(new Dimension(700, 700));

        droite.setPreferredSize(new Dimension(300, 700));
        droite.setBackground(Color.WHITE);
        droite.add(new JTextArea("Bonjour !"));

        // Grille de 64 boutons
        gauche.setLayout(new GridLayout(8, 8));
        for (j = 1; j < 9; j++)
            for (i = 1; i < 9; i++)
            {
                if (j == 1 || j == 8)
                {
                    gauche.add(new Bouton("T", i, j));
                    i++;
                    gauche.add(new Bouton("F", i, j));
                    i++;
                    gauche.add(new Bouton("C", i, j));
                    i++;
                    gauche.add(new Bouton("R", i, j));
                    i++;
                    gauche.add(new Bouton("D", i, j));
                    i++;
                    gauche.add(new Bouton("C", i, j));
                    i++;
                    gauche.add(new Bouton("F", i, j));
                    i++;
                    gauche.add(new Bouton("T", i, j));
                    i++;
                } else if (j == 2 || j == 7)
                {
                    gauche.add(new Bouton("S", i, j));

                } else
                    gauche.add(new Bouton("", i, j));
            }

        this.getContentPane().setLayout(new BorderLayout());

        this.getContentPane().add(gauche, BorderLayout.WEST);
        this.getContentPane().add(droite, BorderLayout.EAST);

        this.setVisible(true);
    }
}