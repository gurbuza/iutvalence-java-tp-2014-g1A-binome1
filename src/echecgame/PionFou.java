/* TODO Nom de package. */
package echecgame;

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
    public boolean deplacementEstValide(Pion[][] echiquier, int ligneDepart,
            int colonneDepart, int ligneArrivee, int colonneArrivee)
    {
        return true;
    }
}
