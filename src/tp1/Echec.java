/* TODO Javadoc. */
package tp1;

public class Echec
{
    private Case Echiquier[][];
    private Joueur joueur1;
    private Joueur joueur2;
    private boolean joueurCourant;

    public Echec()
    {
        /* A completer ( initialisation ) */
    }

    public void jouer()
    {
        /* Algo d'un tour. */
    }

    public Case[][] getEchiquier()
    {
        return Echiquier;
    }

    public void setEchiquier(Case echiquier[][])
    {
        Echiquier = echiquier;
    }

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

    public boolean isJoueurCourant()
    {
        return joueurCourant;
    }

}
