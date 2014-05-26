package ihm;

import javax.swing.SwingUtilities;

import fr.iutvalence.tpjava.g1a.binome1.EchecGUI;


public class AffichageFenetre
{
    
    public static void main(String[] args)
    {
        final EchecGUI partie = new EchecGUI();
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new Fenetre(partie);
            }
        });
    }
}
