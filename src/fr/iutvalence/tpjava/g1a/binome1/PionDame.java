/* TODO Nom de package. */
package fr.iutvalence.tpjava.g1a.binome1;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class PionDame extends Pion
{
    public PionDame(Couleur couleur)
    {
        super(couleur);
    }

    @Override
    public boolean deplacementEstValide(Deplacement deplacement, Pion[][] echiquier)
    {
        int ligneDepart = deplacement.obtenirDepart().ligne();
        int colonneDepart = deplacement.obtenirDepart().colonne();
        int ligneArrivee = deplacement.obtenirArrivee().ligne();
        int colonneArrivee = deplacement.obtenirArrivee().colonne();
        
        if (((ligneDepart==ligneArrivee) && (colonneDepart!=colonneArrivee)) || ((ligneDepart!=ligneArrivee) && (colonneDepart==colonneArrivee)) && (Math.abs(ligneArrivee-ligneDepart)!=Math.abs(colonneArrivee-colonneDepart)) || (Math.abs(ligneArrivee-ligneDepart)==Math.abs(colonneArrivee-colonneDepart)))
            return true;
        return false;
    }
    
    @Override
    public String toString()
    {
        return "D ";
    }
}
