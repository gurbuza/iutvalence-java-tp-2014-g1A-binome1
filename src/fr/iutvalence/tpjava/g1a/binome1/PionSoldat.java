/* TODO Nom de package. */
package fr.iutvalence.tpjava.g1a.binome1;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class PionSoldat extends Pion
{
    private boolean dejaDeplace;
    
    public PionSoldat(Couleur couleur)
    {
        super(couleur);
        this.dejaDeplace = false;
    }

    @Override
    public boolean deplacementEstValide(Deplacement deplacement, Pion[][] echiquier)
    {
        int ligneDepart = deplacement.obtenirDepart().ligne();
        int colonneDepart = deplacement.obtenirDepart().colonne();
        int ligneArrivee = deplacement.obtenirArrivee().ligne();
        int colonneArrivee = deplacement.obtenirArrivee().colonne();
        
        
        if (colonneDepart==colonneArrivee)
        {
            if (!(dejaDeplace))
            {
                if(this.couleur==Couleur.BLANC)
                    if ((ligneDepart-ligneArrivee<0)&&(ligneArrivee-ligneDepart <= 2))
                    {
                        this.dejaDeplace = true;
                        return true;
                    }
                if(this.couleur==Couleur.NOIR)
                    if ((ligneDepart-ligneArrivee>0)&&(ligneArrivee-ligneDepart <= -2))
                    {
                        this.dejaDeplace = true;
                        return true;
                    }
 
            }
            if (dejaDeplace)
            {
                if(this.couleur==Couleur.BLANC)
                    if (ligneDepart-ligneArrivee==1)
                        return true;
                if(this.couleur==Couleur.NOIR)
                    if (ligneDepart-ligneArrivee==-1)
                        return true;
            
            }
        }
        return false;
    }
    
    @Override
    public String toString()
    {
        return "S ";
    }
}
