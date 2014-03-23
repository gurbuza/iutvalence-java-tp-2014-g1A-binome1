/* TODO Nom de package incorrect. À discuter en TP. */
package echecgame;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Joueur
{
    /** TODO. */
    private final Couleur couleur;
    /** TODO. */
    private final String nom;

    /** TODO. */
    public Joueur(Couleur couleur, String nom) {
        this.couleur = couleur;
        this.nom = nom;
    }

    public Couleur obtenirCouleur() {
        return couleur;
    }

    /* TODO Evitez le franglais ! */
    public String getNom() {
        return nom;
    }
    
}
