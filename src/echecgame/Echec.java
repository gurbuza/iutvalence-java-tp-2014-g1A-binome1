/* TODO Javadoc. */
/* TODO Nom de package incorrect. À discuter en TP. */
package echecgame;
import java.util.Scanner; 

public class Echec
{
    private final Pion[][] echiquier;

    private final Joueur joueur1;

    private final Joueur joueur2;

    private boolean joueurCourant;

    public Echec() {
       echiquier = new Pion[8][8];
       premierPlacement();
       this.joueur1 = new Joueur(Couleur.BLANC, "Tom");
       this.joueur2 = new Joueur(Couleur.NOIR, "Jerry");
       this.joueurCourant = true;
    }
       /* C'est très inutile, n'en prenez pas en compte s'il vous plaît.
        * 
        */


    public void jouer()
    {
        afficherEchiquier();
        Scanner selectionPion = new Scanner(System.in);
        Scanner positionArrivee = new Scanner(System.in);
        
        System.out.println("Veuillez selectionner votre pion :");
        int numeroligne = selectionPion.nextInt();
        //System.out.println("Vous avez selectionner le pion en : " + str);
        
        System.out.println("Veuillez saisir la position d'arrivée :");
        String str1 = positionArrivee.nextLine();
        //System.out.println("Vous saisi comme position d'arrivée : " + str1);
        
        if ((numeroligne<0) || (numerocolonne<0) || (ligneDepart>7) || (colonneDepart>7) || (ligneArrivee<0) || (colonneArrivee<0) || (ligneArrivee>7) || (colonneArrivee>7))
            return false;
        
        /* Algo d'un tour :
         *  - Afficher l'échiquier.
         *  - Demander le déplacement à effectuer.
         *  - Valider le coup (grille + pion).
         *  - Si valide, jouer le coup. Sinon retour étape 2.
         *  - Changer le joueur courant.
         */
        
        
    }
    
    private void afficherEchiquier()
    {
        String echiquierAsciiArt = "";
        for (int ligne=0;ligne < 8; ligne++)
        {
            for(int colonne=0;colonne < 8; colonne++)
            {
                echiquierAsciiArt += "■ ";
            }
            echiquierAsciiArt +="\n";
            
        }
        
        System.out.println(echiquierAsciiArt);
    }

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
