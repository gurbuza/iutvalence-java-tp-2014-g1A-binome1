package ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import fr.iutvalence.tpjava.g1a.binome1.Deplacement;

public class Bouton extends JButton implements ActionListener
{
    private int x;
    private int y;
    private DeplacementIHM pos = new DeplacementIHM()
    
    public int obtenirX()
    {
        return this.x;
    }



    public int obtenirY()
    {
        return this.y;
    }

    
    public Bouton(String text,int x, int y)
    {
        
        super(text);
        this.x = x;
        this.y = y;
        addActionListener(this);
    }


    @Override
    public synchronized void actionPerformed(ActionEvent e)
    {
        if (pos.obtenirDepart() == null)
        {
            int x0=this.obtenirX();
            int y0=this.obtenirY();
            pos.setDepart()
        }
        else 
        {
            int x1=this.obtenirX();
            int y1=this.obtenirY();
            pos.setArrivee()
            // XXX
            
        }
    }
}

