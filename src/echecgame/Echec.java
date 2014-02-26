/* TODO Javadoc. */
/* TODO Nom de package. */
package echecgame;

public class Echec
{
    /* TODO Final ? */
    /* TODO Convention du java (pas de majuscule en première lettre). */
    private Case Echiquier[][];
    /* TODO Final ? */
    private Joueur joueur1;
    /* TODO Final ? */
    private Joueur joueur2;
    private boolean joueurCourant;

    public Echec()
    {
       /* TODO Vide ??? */
    }

    public void jouer()
    {
        /* Algo d'un tour. */
    }

    public Case[][] getEchiquier()
    {
        /* TODO Attention lors de retour d'array. */
        return Echiquier;
    }

    /* TODO Attention franglais ! */
    /* TODO Pourquoi un "setEchiquier" ??? */
    public void setEchiquier(Case echiquier[][])
    {
        Echiquier = echiquier;
    }

    /* TODO Pourquoi des getters/setters sur les joueurs ? */
    public Joueur getJoueur1()
    {
        return joueur1;
    }

    public void setJoueur1(Joueur joueur1)
    {
        this.joueur1 = joueur1;
    }

    public Joueur getJoueur2()
    {
        return joueur2;
    }

    public void setJoueur2(Joueur joueur2)
    {
        this.joueur2 = joueur2;
    }

    /* TODO Nom de méthode incompréhensible… */
    public boolean isJoueurCourant()
    {
        return joueurCourant;
    }

}
