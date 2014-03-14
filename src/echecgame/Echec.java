/* TODO Javadoc. */
/* TODO Nom de package incorrect. À discuter en TP. */
package echecgame;

public class Echec
{
    private final Pion[][] echiquier;

    private final Joueur joueur1;

    private final Joueur joueur2;

    private boolean joueurCourant;

    public Echec() {
       echiquier = new Pion[8][8];
       /* TODO Mettre ce placement dans une méthode dédiée pour faciliter la lecture. */
       /* Placement des pions. */
       echiquier[0][0] = new PionTour(Couleur.BLANC);
       echiquier[0][1] = new PionCavalier(Couleur.BLANC);
       echiquier[0][2] = new PionFou(Couleur.BLANC);
       echiquier[0][3] = new PionRoi(Couleur.BLANC);
       echiquier[0][4] = new PionDame(Couleur.BLANC);
       echiquier[0][5] = new PionFou(Couleur.BLANC);
       echiquier[0][6] = new PionCavalier(Couleur.BLANC);
       echiquier[0][7] = new PionTour(Couleur.BLANC);
       for (int colonne=0;colonne<8; colonne++)
           echiquier[1][colonne] = new PionSoldat(Couleur.NOIR);
       echiquier[7][0] = new PionTour(Couleur.NOIR);
       echiquier[7][1] = new PionCavalier(Couleur.NOIR);
       echiquier[7][2] = new PionFou(Couleur.NOIR);
       echiquier[7][3] = new PionRoi(Couleur.NOIR);
       echiquier[7][4] = new PionDame(Couleur.NOIR);
       echiquier[7][5] = new PionFou(Couleur.NOIR);
       echiquier[7][6] = new PionCavalier(Couleur.NOIR);
       echiquier[7][7] = new PionTour(Couleur.NOIR);
       for (int colonne=0;colonne<8; colonne++)
           echiquier[6][colonne] = new PionSoldat(Couleur.NOIR);

       this.joueur1 = new Joueur(Couleur.BLANC, "Tom");
       this.joueur2 = new Joueur(Couleur.NOIR, "Jerry");
       this.joueurCourant = true;
       
       /* C'est très inutile, n'en prenez pas en compte s'il vous plaît.
        * 
        */
       String echiquierAsciiArt = "";
       for (int ligne=0;ligne < 8; ligne++)
       {
           for(int colonne=0;colonne < 8; colonne++)
               echiquierAsciiArt += "■ ";
           echiquierAsciiArt +="\n";
       }
           
       System.out.println(echiquierAsciiArt);
    }

    /* TODO Ne devrait pas être "static". */
    public static void jouer()
    {
        /* Algo d'un tour :
         *  - Afficher l'échiquier.
         *  - Demander le déplacement à effectuer.
         *  - Valider le coup (grille + pion).
         *  - Si valide, jouer le coup. Sinon retour étape 2.
         *  - Changer le joueur courant.
         */
        
        
    }
}
