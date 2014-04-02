/* TODO Nom de package incorrect. À discuter en TP. */
package fr.iutvalence.tpjava.g1a.binome1;

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

    public String obtenirNom() {
        return nom;
    }
    
    
}
