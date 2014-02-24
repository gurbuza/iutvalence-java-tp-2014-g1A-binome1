/* TODO Javadoc. */
package tp1;

public class Case
{
    
    public boolean presencePion;

    private final boolean couleur;

    public Case(boolean couleur)
    {
        this.presencePion = false;
        this.couleur = couleur;
    }

    public boolean presenceDuPion()
    {
        return presencePion;
    }
}
