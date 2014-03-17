/* TODO Javadoc. */
/* TODO Nom de package. */
package echecgame;

public class PionSoldat extends Pion
{
    public PionSoldat(Couleur couleur)
    {
        super(couleur);
    }

    @Override
    public boolean deplacementEstValide(Pion[][] echiquier, int ligneDepart,
            int colonneDepart, int ligneArrivee, int colonneArrivee)
    {
        return true;
    }

        /*
         * if (this.obtenirCouleur() == BLANC) if (this.ligneDepart == 6 )
         */


}
