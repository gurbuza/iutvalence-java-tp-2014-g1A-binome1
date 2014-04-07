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
    

    public boolean deplacementEstValide(Deplacement deplacement, Pion[][] echiquier)
    {
        int ligneDepart = deplacement.obtenirDepart().ligne();
        int colonneDepart = deplacement.obtenirDepart().colonne();
        int ligneArrivee = deplacement.obtenirArrivee().ligne();
        int colonneArrivee = deplacement.obtenirArrivee().colonne();
        
        int diffLigne = Math.abs(ligneDepart-ligneArrivee);
        int diffCol = Math.abs(colonneDepart-colonneArrivee);
        if (((ligneDepart==ligneArrivee) && (colonneDepart!=colonneArrivee)) || ((ligneDepart!=ligneArrivee) && (colonneDepart==colonneArrivee)) && (Math.abs(ligneArrivee-ligneDepart)!=Math.abs(colonneArrivee-colonneDepart)))
        {
            if (diffLigne!=0)
                for (int j=1;j<diffLigne-1;j++)
                    if (echiquier[j][colonneDepart]!=null)
                        return false;
            if (diffCol!=0)
                for (int j=1;j<diffCol-1;j++)
                    if (echiquier[ligneDepart][j]!=null)
                        return false;
            return true;
        }
                    
        return false;
    }
    
    @Override
    public String toString()
    {
        return "T ";
    }
}
