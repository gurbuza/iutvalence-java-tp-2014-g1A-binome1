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

    public boolean getCouleur()
    {
        return couleur;
    }

    public String getNom()
    {
        return nom;
    }
    
}
