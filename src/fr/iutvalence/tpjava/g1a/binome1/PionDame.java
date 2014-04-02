/* TODO Nom de package. */
package fr.iutvalence.tpjava.g1a.binome1;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class PionDame extends Pion
{
    public PionDame(Couleur couleur)
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
        return "D ";
    }
}
