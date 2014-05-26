package ihm;

import java.awt.event.ActionListener;


import fr.iutvalence.tpjava.g1a.binome1.Pion;
import fr.iutvalence.tpjava.g1a.binome1.Position;

public class DeplacementIHM
{
    public Position depart;
    public Position arrivee;


    public DeplacementIHM(int numeroLigneDepart,int numeroColonneDepart, int numeroLigneArrivee, int numeroColonneArrivee)
    {
        this.depart = new Position(numeroLigneDepart, numeroColonneDepart);
        this.arrivee = new Position(numeroLigneArrivee, numeroColonneArrivee);

    }
     
    public Position obtenirDepart()
    {
        return (depart.ligne()==0 && depart.colonne()==0) ? null : this.depart;
    }
    
    public Position obtenirArrivee()
    {
        return this.arrivee;
    }


    public void setDepart(int x,int y)
    {
        this.depart = new Position(x,y);
    }

    public void setArrivee(int x, int y)
    {
        this.arrivee = new Position(x,y);
    }
    

}
