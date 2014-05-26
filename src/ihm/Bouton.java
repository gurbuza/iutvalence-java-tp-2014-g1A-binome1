package ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import fr.iutvalence.tpjava.g1a.binome1.Deplacement;
import fr.iutvalence.tpjava.g1a.binome1.EchecGUI;
import fr.iutvalence.tpjava.g1a.binome1.Pion;

public class Bouton extends JButton implements ActionListener
{
    private int x;
    private int y;
    private EchecGUI partie;
    public static final DeplacementIHM POSITION = new DeplacementIHM(0,0,0,0);
    private Pion[][] echiquier;
    
    public int obtenirX()
    {
        return this.x;
    }



    public int obtenirY()
    {
        return this.y;
    }

    
    public Bouton(String text,int x, int y, EchecGUI partie)
    {
        
        super(text);
        this.x = x;
        this.y = y;
        this.partie = partie;
        addActionListener(this);
        
    }


    @Override
    public synchronized void actionPerformed(ActionEvent e)
    {
       
        if (POSITION.obtenirDepart() == null)
        {
            int x0=this.obtenirX();
            int y0=this.obtenirY();
            POSITION.setDepart(x0,y0);
            // XXX Mettre dans le textfield de la fenetre
            System.out.println("Depart x : "+x0+" y : "+y0);
        }
        else 
        {
            Fenetre.desactivationBouton();
            int x1=this.obtenirX();
            int y1=this.obtenirY();
            POSITION.setArrivee(x1,y1);
            // XXX Mettre dans le textfield de la fenetre
            System.out.println("Arrivee x : "+x1+" y : "+y1);
            ajoutTexte("AHAHAHAHAH");
            Deplacement deplacement = new Deplacement(Bouton.POSITION.obtenirDepart().ligne(), Bouton.POSITION.obtenirDepart().colonne(),Bouton.POSITION.obtenirArrivee().ligne(), Bouton.POSITION.obtenirArrivee().colonne(), echiquier.clone());
            if (partie.estDeplacementValide(deplacement))
            {
                partie.Mvt(deplacement, echiquier);
                ajoutTexte("Deplacement Effectué");
            }
            else
                ajoutTexte("FAUTE");
            // Si : Faire le mouvement.
            // Sinon : alerte.
            // Demancher le raffaichissement IHM.
            // Restauration grille/mouvement et fin.
            
        }
    }



  
}

