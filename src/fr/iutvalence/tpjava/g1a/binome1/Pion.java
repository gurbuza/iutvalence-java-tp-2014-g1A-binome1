/* TODO Nom de package incorrect. À discuter en TP. */
package fr.iutvalence.tpjava.g1a.binome1;

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
