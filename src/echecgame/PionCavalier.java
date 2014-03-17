/* TODO Javadoc. */
/* TODO Nom de package. */
package echecgame;

public class PionCavalier extends Pion
{

    public PionCavalier(Couleur couleur)
    {
        super(couleur);
    }

    @Override
    public boolean deplacementEstValide(Pion[][] echiquier, int ligneDepart,int colonneDepart, int ligneArrivee, int colonneArrivee)
    {
       if (Math.abs(ligneDepart-ligneArrivee)== 2 && Math.abs(colonneArrivee-colonneDepart) == 1)
           return true;
       if (Math.abs(ligneDepart-ligneArrivee)== 1 && Math.abs(colonneArrivee-colonneDepart) == 2)
           return true;
       return false;
    }

}
