/* TODO Nom de package incorrect. */
package echecgame;

import java.util.Scanner;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
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
    private boolean joueurCourant;

    /** TODO. */
    public Echec() {
       echiquier = new Pion[8][8];
       premierPlacement();
       /* TODO Passez en paramètre le nom des joueurs. */
       this.joueur1 = new Joueur(Couleur.BLANC, "Tom");
       this.joueur2 = new Joueur(Couleur.NOIR, "Jerry");
       this.joueurCourant = true;
    }

    /** TODO. */
    public void jouer()
    {
        this.premierPlacement();
        this.afficherEchiquier();
        
        Deplacement deplacement = this.obtenirDeplacementValide();
             
        /* Algo d'un tour :
         *  - Afficher l'échiquier.
         *  - Demander le déplacement à effectuer.
         *  - Valider le coup (grille + pion).
         *  - Si valide, jouer le coup. Sinon retour étape 2.
         *  - Changer le joueur courant.
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
        
        deplacement = new Deplacement(numeroligne,numerocolonne,numerolignearrivee,numerocolonnearrivee);
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
                   System.out.println("yolo !");
                   break;
               }
           System.out.println("Veuillez ressayer SVP !");
       }
       return deplacement;
           
    }


    public boolean estDeplacementValide(Deplacement deplacement)
    {
        if ((deplacement.positionArrive.obtenirNumeroLigne()<0 )|| (deplacement.positionArrive.obtenirNumeroColonne()<0) || (deplacement.positionArrive.obtenirNumeroLigne()<7) || (deplacement.positionArrive.obtenirNumeroColonne()>7) || (deplacement.positionDepart.obtenirNumeroLigne()<0) || (deplacement.positionDepart.obtenirNumeroColonne()<0) || (deplacement.positionDepart.obtenirNumeroLigne()>7) || (deplacement.positionDepart.obtenirNumeroColonne()>7))
                return false;
        else if (echiquier[deplacement.positionDepart.obtenirNumeroLigne()][deplacement.positionDepart.obtenirNumeroColonne()]==null)
                return false;
        return true;
    }

    /* TODO À quoi ça sert ? */
    /** TODO. */
    private void afficherEchiquier()
    {
        String echiquierConsole = "";
        for (int ligne=0;ligne < 8; ligne++)
        {
            for(int colonne=0;colonne < 8; colonne++)
            {
                if ((ligne==0)&&(colonne==0))
                    echiquierConsole += "T ";
                else 
                    echiquierConsole += "V ";
            }
            echiquierConsole +="\n";

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
            echiquier[1][colonne] = new PionSoldat(Couleur.NOIR);
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
