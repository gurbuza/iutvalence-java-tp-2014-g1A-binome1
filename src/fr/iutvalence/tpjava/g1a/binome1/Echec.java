
package fr.iutvalence.tpjava.g1a.binome1;

import java.util.Scanner;

/**
 * Classe echec
 * 
 * @author Hoang Thai Binh / Gurbuz Adem
 * @version v0.5
 */
public class Echec
{
    /** TODO. */
    private final Pion[][] echiquier;

    /** TODO. */
    private final Joueur joueur1;

    /** TODO. */
    private final Joueur joueur2;

    /** TODO. */
    private Joueur joueurCourant;

    /** TODO. */
    public Echec()
    {
        echiquier = new Pion[8][8];
        /* TODO Passez en paramètre le nom des joueurs. */
        this.joueur1 = new Joueur(Couleur.BLANC, "Tom");
        this.joueur2 = new Joueur(Couleur.NOIR, "Jerry");
        this.joueurCourant = joueur1;
    }

    /** TODO. */
    public void jouer()
    {
        this.premierPlacement();
        this.afficherEchiquier();
        
        
        while(true)
        {
            Deplacement deplacement = this.obtenirDeplacementValide();
            Mvt(deplacement,echiquier);
        }
        

        /*
         * Algo d'un tour : 
         * - Afficher l'échiquier. 
         * - Demander le déplacement à effectuer. 
         * - Valider le coup (grille + pion). 
         * - Si valide, jouer le coup. Sinon retour étape 2. 
         * - Changer le joueur courant.
         */
    }

    public Deplacement obtenirDeplacement()
    {
        Deplacement deplacement;
        /* TODO Vous n'avez pas besoin de deux lecteurs sur l'entrée standard ! */
        Scanner selectionPion = new Scanner(System.in);
        Scanner positionArrivee = new Scanner(System.in);

        /* TODO Vous faites deux demandes pour 4 coordonnées ? */
        System.out.println("Veuillez selectionner votre pion :");
        int numeroligne = selectionPion.nextInt();
        int numerocolonne = selectionPion.nextInt();

        System.out.println("Veuillez saisir la position d'arrivée :");
        int numerolignearrivee = selectionPion.nextInt();
        int numerocolonnearrivee = selectionPion.nextInt();

        deplacement = new Deplacement(numeroligne, numerocolonne,
                numerolignearrivee, numerocolonnearrivee, echiquier);
        return deplacement;

    }

    public Deplacement obtenirDeplacementValide() 
    {
        Deplacement deplacement;
        while (true)
        {
            deplacement = obtenirDeplacement();
            if (this.estDeplacementValide(deplacement))
            {
                int ligneDepart = deplacement.obtenirDepart().ligne();
                int colonneDepart = deplacement.obtenirDepart().colonne();
                if (this.joueurCourant.obtenirCouleur()==this.echiquier[ligneDepart][colonneDepart].obtenirCouleur())
                    {
                        System.out.println("yolo !");
                        break;
                    }
            }
            System.out.println("Veuillez ressayer SVP !");
        }
        return deplacement;

    }

    public boolean estDeplacementValide(Deplacement deplacement)
    {
     
        Pion depart = echiquier[deplacement.depart.ligne()][deplacement.depart.colonne()];
        Pion arrivee = echiquier[deplacement.arrivee.ligne()][deplacement.arrivee.colonne()];
        
        if (depart == null)
            return false;
        
        if (arrivee != null && depart.obtenirCouleur() == arrivee.obtenirCouleur())
            return false;
        
        return depart.deplacementEstValide(deplacement);

    }
    
    public void Mvt(Deplacement deplacement, Pion[][] echiquier)
    {
        int ligneDepart = deplacement.obtenirDepart().ligne();
        int colonneDepart = deplacement.obtenirDepart().colonne();
        int ligneArrivee = deplacement.obtenirArrivee().ligne();
        int colonneArrivee = deplacement.obtenirArrivee().colonne();
        echiquier[ligneArrivee][colonneArrivee]=echiquier[ligneDepart][colonneDepart];
        echiquier[ligneDepart][colonneDepart]=null;
        afficherEchiquier();
        if (this.joueurCourant==joueur1)
            this.joueurCourant=joueur2;
        else
            this.joueurCourant=joueur1;
    }

    /* TODO À quoi ça sert ? */
    /** TODO. */
    private void afficherEchiquier()
    {
        String echiquierConsole = "    ";
        for (int ligne = 0; ligne < 8; ligne++) {
            echiquierConsole += String.valueOf(ligne);
            echiquierConsole += ' ';
        }
        echiquierConsole += '\n';
        for (int ligne = 0; ligne < 8; ligne++)
        {
            echiquierConsole += ligne + " | ";
            for (int colonne = 0; colonne < 8; colonne++)
            {
               echiquierConsole += (echiquier[ligne][colonne] == null) ? ". " : echiquier[ligne][colonne].toString();
            }
            echiquierConsole += "|\n";

        }

        System.out.println(echiquierConsole);
    }

    /** TODO. */
    private void premierPlacement()
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
