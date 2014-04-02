/* TODO Nom de package. */
package fr.iutvalence.tpjava.g1a.binome1;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class PionFou extends Pion
{
    public PionFou(Couleur couleur) 
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
        return "F ";
    }
}
