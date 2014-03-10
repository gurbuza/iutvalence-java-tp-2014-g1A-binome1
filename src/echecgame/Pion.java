/* TODO Javadoc. */
package echecgame;


public abstract class Pion
{
    private final boolean couleur;
    
    public Pion(boolean couleur)
    {
        this.couleur = couleur;
    }

    public boolean obtenirCouleur()
    {
        return couleur;
    }

    /* TODO Un peu pauvre comme API. */
    public abstract void deplacementEstValidé();
}
