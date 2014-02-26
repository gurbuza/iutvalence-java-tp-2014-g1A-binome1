/* TODO Javadoc. */
/* TODO Nom de package. */
package echecgame;

public class Joueur
{
    /* TODO Pourquoi retenir la couleur ? */
    private final boolean couleur;
    private final String nom;
    
    public Joueur(boolean couleur, String nom)
    {
        this.couleur = couleur;
        this.nom = nom;
    }

    /* TODO Franglais ! */
    public boolean getCouleur()
    {
        return couleur;
    }

    public String getNom()
    {
        return nom;
    }
    
}
