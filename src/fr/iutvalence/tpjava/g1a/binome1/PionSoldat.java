/* TODO Nom de package. */
package fr.iutvalence.tpjava.g1a.binome1;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class PionSoldat extends Pion
{
    private boolean dejaDeplace;
    
    public PionSoldat(Couleur couleur)
    {
        super(couleur);
        this.dejaDeplace = false;
    }

    @Override
    public boolean deplacementEstValide(Deplacement deplacement, Pion[][] echiquier)
    {
        return true;
    }
    
    @Override
    public String toString()
    {
        return "S ";
    }
}
