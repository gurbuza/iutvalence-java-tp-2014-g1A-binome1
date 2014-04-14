package fr.iutvalence.tpjava.g1a.binome1;

public class DeplacementException extends Exception
{
    ((deplacement.arrivee.ligne() < 0)
            || (deplacement.arrivee.colonne() < 0)
            || (deplacement.arrivee.ligne() > 7)
            || (deplacement.arrivee.colonne() > 7)
            || (deplacement.depart.ligne() < 0)
            || (deplacement.depart.colonne() < 0)
            || (deplacement.depart.ligne() > 7)
            || (deplacement.depart.colonne() > 7))
}
