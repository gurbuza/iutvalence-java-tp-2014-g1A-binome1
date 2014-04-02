/* TODO Nom de package. */
package fr.iutvalence.tpjava.g1a.binome1;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class PionRoi extends Pion
{
    public PionRoi(Couleur couleur)
    {
        super(couleur);
    }

    @Override
    public boolean deplacementEstValide(Deplacement deplacement)
    {
        return true;
    }
    
    @Override
    public String toString()
    {
        return "R ";
    }
}
