/* TODO Nom de package. */
package fr.iutvalence.tpjava.g1a.binome1;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class PionTour extends Pion
{
    public PionTour(Couleur couleur)
    {
        super(couleur);
    }

    @Override
    public boolean deplacementEstValide(Deplacement deplacement)
    {
        int ligneDepart = deplacement.obtenirDepart().ligne();
        int colonneDepart = deplacement.obtenirDepart().colonne();
        int ligneArrivee = deplacement.obtenirArrivee().ligne();
        int colonneArrivee = deplacement.obtenirArrivee().colonne();
        
        int diffLigne = Math.abs(ligneDepart-ligneArrivee);
        int diffCol = Math.abs(colonneDepart-colonneArrivee);
        if ((ligneDepart==ligneArrivee) || (colonneDepart==colonneArrivee))
            
            if (diffLigne!=0)
                for (int j=0;j<diffLigne-1;j++)
                {
                    
                }
                    
            return true;
        
        return false;
    }
    
    @Override
    public String toString()
    {
        return "T ";
    }
}
