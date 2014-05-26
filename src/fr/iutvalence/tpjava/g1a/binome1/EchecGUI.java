package fr.iutvalence.tpjava.g1a.binome1;


public class EchecGUI
{
    /** l'echicquier est un tableau de pion */
    private final Pion[][] echiquier;

    /** 1er joueur */
    private final Joueur joueur1;

    /** 2eme joueur */
    private final Joueur joueur2;

    /** le joueur qui joue */
    private Joueur joueurCourant;

    /** cree un tableau de pion de 8x8 et cree les 2 joueurs, en asignant a l'un le droit de jouer. */
    public EchecGUI()
    {
        echiquier = new Pion[8][8];
        /** Passez en parametre le nom des joueurs. */
        this.joueur1 = new Joueur(Couleur.BLANC, "Tom");
        this.joueur2 = new Joueur(Couleur.NOIR, "Jerry");
        this.joueurCourant = joueur1;
        premierPlacement();
    }
    
    /** verifie si le deplacement est valide, qu'il y a bien un pion au joueur courant 
     * sur la case selectionne et qu'il n'y a pas de pion a lui sur la case d'arrivee */
    public boolean estDeplacementValide(Deplacement deplacement)
    {
     
        Pion depart = echiquier[deplacement.depart.ligne()][deplacement.depart.colonne()];
        Pion arrivee = echiquier[deplacement.arrivee.ligne()][deplacement.arrivee.colonne()];
        
        if (depart == null)
            return false;
        
        if (arrivee != null && depart.obtenirCouleur() == arrivee.obtenirCouleur())
            return false;
        
        return depart.deplacementEstValide(deplacement, echiquier.clone());

    }
    
    /** affiche le deplacement en supprimant la pion de la case de depart 
     * et en l'affichant a la case d'arrivee, si possible. Par la meme occasion,
     * le joueur courant change*/
    public void Mvt(Deplacement deplacement, Pion[][] echiquier)
    {
        int ligneDepart = deplacement.obtenirDepart().ligne();
        int colonneDepart = deplacement.obtenirDepart().colonne();
        int ligneArrivee = deplacement.obtenirArrivee().ligne();
        int colonneArrivee = deplacement.obtenirArrivee().colonne();
        echiquier[ligneArrivee][colonneArrivee]=null;
        echiquier[ligneArrivee][colonneArrivee]=echiquier[ligneDepart][colonneDepart];
        echiquier[ligneDepart][colonneDepart]=null;
        if (this.joueurCourant==joueur1)
            this.joueurCourant=joueur2;
        else
            this.joueurCourant=joueur1;
    }

    /** Position de depart de tout les pions du jeu, pour les 2 joueurs.*/
    public void premierPlacement()
    {
        /* Placement des pions. */
        echiquier[0][0] = new PionTour(Couleur.BLANC);
        echiquier[0][1] = new PionCavalier(Couleur.BLANC);
        echiquier[0][2] = new PionFou(Couleur.BLANC);
        echiquier[0][3] = new PionRoi(Couleur.BLANC);
        echiquier[0][4] = new PionDame(Couleur.BLANC);
        echiquier[0][5] = new PionFou(Couleur.BLANC);
        echiquier[0][6] = new PionCavalier(Couleur.BLANC);
        echiquier[0][7] = new PionTour(Couleur.BLANC);
        for (int colonne = 0; colonne < 8; colonne++)
            echiquier[1][colonne] = new PionSoldat(Couleur.BLANC);
        echiquier[7][0] = new PionTour(Couleur.NOIR);
        echiquier[7][1] = new PionCavalier(Couleur.NOIR);
        echiquier[7][2] = new PionFou(Couleur.NOIR);
        echiquier[7][3] = new PionRoi(Couleur.NOIR);
        echiquier[7][4] = new PionDame(Couleur.NOIR);
        echiquier[7][5] = new PionFou(Couleur.NOIR);
        echiquier[7][6] = new PionCavalier(Couleur.NOIR);
        echiquier[7][7] = new PionTour(Couleur.NOIR);
        for (int colonne = 0; colonne < 8; colonne++)
            echiquier[6][colonne] = new PionSoldat(Couleur.NOIR);
    }
}
