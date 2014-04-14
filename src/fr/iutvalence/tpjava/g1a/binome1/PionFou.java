/* TODO Nom de package. */
package fr.iutvalence.tpjava.g1a.binome1;

/**
 * TODO.
 * 
 * @author TODO
 * @version TODO
 */
public class PionFou extends Pion
{
    public PionFou(Couleur couleur)
    {
        super(couleur);

    }

    @Override
    public boolean deplacementEstValide(Deplacement deplacement,
            Pion[][] echiquier)
    {
        int ligneDepart = deplacement.obtenirDepart().ligne();
        int colonneDepart = deplacement.obtenirDepart().colonne();
        int ligneArrivee = deplacement.obtenirArrivee().ligne();
        int colonneArrivee = deplacement.obtenirArrivee().colonne();

        if (Math.abs(ligneArrivee - ligneDepart) == Math.abs(colonneArrivee
                - colonneDepart))
        {
            int Ldelta = ligneDepart - ligneArrivee
                    / Math.abs(ligneDepart - ligneArrivee);
            int Cdelta = colonneDepart - colonneArrivee
                    / Math.abs(colonneDepart - colonneArrivee);
            for (int i = 1; i < Math.abs(ligneArrivee - ligneDepart) - 1; i++) 
                if (echiquier[ligneDepart+i*Ldelta][colonneDepart+i*Cdelta] != null)
                {
                    return false;
                }
            return true;

        }
        System.out.println("AZERRT"); 
        return false;

    }

    @Override
    public String toString()
    {
        return "F ";
    }
}
