/* TODO Nom de package incorrect. À discuter en TP. */
package echecgame;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public abstract class Pion
{
    /** TODO. */
    protected final Couleur couleur;

    /** TODO. */
    public Pion(Couleur couleur)
    {
        this.couleur = couleur;
    }

    /** TODO. */
    public Couleur obtenirCouleur()
    {
        return couleur;
    }

    /** TODO. */
    public abstract boolean deplacementEstValide(Pion[][] echiquier, int ligneDepart,int colonneDepart, int ligneArrivee, int colonneArivee );
}
