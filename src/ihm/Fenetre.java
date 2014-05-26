package ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

import fr.iutvalence.tpjava.g1a.binome1.EchecGUI;

public class Fenetre extends JFrame implements IHMInterface
{
    public JPanel gauche = new JPanel();
    public JPanel droite = new JPanel();

    public Fenetre(EchecGUI partie)
    {
        int i, j;
        this.setTitle("Echecs");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setSize(1000, 700);
        this.setResizable(false);
        

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
                    gauche.add(new Bouton("T", i, j, partie));
                    i++;
                    gauche.add(new Bouton("F", i, j, partie));
                    i++;
                    gauche.add(new Bouton("C", i, j, partie));
                    i++;
                    gauche.add(new Bouton("R", i, j, partie));
                    i++;
                    gauche.add(new Bouton("D", i, j, partie));
                    i++;
                    gauche.add(new Bouton("C", i, j, partie));
                    i++;
                    gauche.add(new Bouton("F", i, j, partie));
                    i++;
                    gauche.add(new Bouton("T", i, j, partie));
                    i++;
                } else if (j == 2 || j == 7)
                {
                    gauche.add(new Bouton("S", i, j,partie));

                } else
                    gauche.add(new Bouton("", i, j,partie));
            }
        

        this.getContentPane().setLayout(new BorderLayout());

        this.getContentPane().add(gauche, BorderLayout.WEST);
        this.getContentPane().add(droite, BorderLayout.EAST);

        this.setVisible(true);
    }

    @Override
    public void desactivationBouton()
    {
        for (int i=0;i<64;i++)
            gauche.getComponent(i).setEnabled(false);
        
    }

    @Override
    public void ajoutTexte(String text)
    {
        droite.add(new TextField(text));
        
    }

    @Override
    public void deplacement()
    {
        // TODO Auto-generated method stub
        
    }

 


}