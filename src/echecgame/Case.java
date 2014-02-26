/* TODO Javadoc. */
/* TODO Nom de package. */
package echecgame;

public class Case
{
    public Pion pion;
    /* À quoi sert de retenir la couleur de la case ? */
    private final boolean couleur;

    public Case(boolean couleur)
    {
        this.pion = null;
        this.couleur = couleur;
    }

    /* TODO Evitez le franglais ! */
    public boolean getCouleur()
    {
        return couleur;
    }
}
