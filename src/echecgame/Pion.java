/* TODO Javadoc. */
/* TODO Nom de package incorrect. À discuter en TP. */
package echecgame;

public abstract class Pion
{
    private final boolean couleur;
    /* TODO Pourquoi faire un constructeur public dans une classe "abstract" ? */
    public Pion(boolean couleur)
    {
        this.couleur = couleur;
    }

    public boolean obtenirCouleur()
    {
        return couleur;
    }

    /* TODO Il doit vous manquer des paramètres ? */
    /* TODO Evitez les noms de méthodes à accents... */
    public abstract void deplacementEstValidé();
}
