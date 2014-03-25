package echecgame;

public class Position
{
    private int numeroLigne;
    private int numeroColonne;
    
    public Position(int numligne, int numcolonne)
    {
        this.numeroColonne=numcolonne;
        this.numeroLigne=numligne;
    }

    public int obtenirNumeroLigne()
    {
        return this.numeroLigne;
    }

    public int obtenirNumeroColonne()
    {
        return this.numeroColonne;
    }
    
}
