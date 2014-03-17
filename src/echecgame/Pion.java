/* TODO Javadoc. */
/* TODO Nom de package incorrect. À discuter en TP. */
package echecgame;

public abstract class Pion
{
    protected final Couleur couleur;
    
    public Pion(Couleur couleur)
    {
        this.couleur = couleur;
    }

    public Couleur obtenirCouleur()
    {
        return couleur;
    }

    /* TODO Il doit vous manquer des paramètres ? */
    public abstract boolean deplacementEstValide(Pion[][] echiquier, int ligneDepart,int colonneDepart, int ligneArrivee, int colonneArivee );
}
