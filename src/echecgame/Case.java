/* TODO Javadoc. */
package echecgame;

public class Case
{
    
    public Pion pion;

    private final boolean couleur;

    public Case(boolean couleur)
    {
        this.pion = null;
        this.couleur = couleur;
    }

    public boolean getCouleur()
    {
        return couleur;
    }
}
