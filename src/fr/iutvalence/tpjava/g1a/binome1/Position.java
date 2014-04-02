package fr.iutvalence.tpjava.g1a.binome1;

public class Position
{
    private int numeroLigne;
    private int numeroColonne;
    
    public Position(int numligne, int numcolonne)
    {
        this.numeroColonne=numcolonne;
        this.numeroLigne=numligne;
    }

    public int ligne()
    {
        return this.numeroLigne;
    }

    public int colonne()
    {
        return this.numeroColonne;
    }
    
}
