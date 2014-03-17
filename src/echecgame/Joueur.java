/* TODO Javadoc. */
/* TODO Nom de package incorrect. À discuter en TP. */
package echecgame;

public class Joueur
{
    private final Couleur couleur;
    private final String nom;
    
    public Joueur(Couleur couleur, String nom)
    {
        this.couleur = couleur;
        this.nom = nom;
    }

    public Couleur obtenirCouleur()
    {
        return couleur;
    }

    public String getNom()
    {
        return nom;
    }
    
}
