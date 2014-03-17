/* TODO Javadoc. */
/* TODO Nom de package. */
package echecgame;

public class PionTour extends Pion
{

    public PionTour(Couleur couleur)
    {
        super(couleur);
    }

    @Override
    public boolean deplacementEstValide(Pion[][] echiquier, int ligneDepart,
            int colonneDepart, int ligneArrivee, int colonneArrivee)
    {
        return true;
    }


}
