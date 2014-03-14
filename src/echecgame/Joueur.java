/* TODO Javadoc. */
/* TODO Nom de package incorrect. À discuter en TP. */
package echecgame;

public class Joueur
{
    private final boolean couleur;
    private final String nom;
    
    public Joueur(boolean couleur, String nom)
    {
        this.couleur = couleur;
        this.nom = nom;
    }

    public boolean obtenirCouleur()
    {
        return couleur;
    }

    public String getNom()
    {
        return nom;
    }
    
}
