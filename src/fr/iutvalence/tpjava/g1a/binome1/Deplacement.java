package fr.iutvalence.tpjava.g1a.binome1;

import java.util.Scanner;

public class Deplacement
{
    public Position positionDepart;
    public Position positionArrive;
    
    public Pion[][] echiquier;
    
    public Deplacement(int numerolignedepart, int numerocolonnedepart, int numerolignearrivee, int numerocolonnearrivee)
    {
        this.positionDepart= new Position(numerolignedepart, numerocolonnedepart);
        this.positionArrive= new Position(numerolignearrivee, numerocolonnearrivee);
    }
    
    
}
