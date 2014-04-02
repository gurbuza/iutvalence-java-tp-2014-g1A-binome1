/* TODO Nom de package. */
package fr.iutvalence.tpjava.g1a.binome1;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class PionCavalier extends Pion
{
    public PionCavalier(Couleur couleur)
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
       
       if (Math.abs(ligneDepart-ligneArrivee)== 2 && Math.abs(colonneArrivee-colonneDepart) == 1)
           return true;
       if (Math.abs(ligneDepart-ligneArrivee)== 1 && Math.abs(colonneArrivee-colonneDepart) == 2)
           return true;
       return false;
    }

    @Override
    public String toString()
    {
        return "C ";
    }
}
