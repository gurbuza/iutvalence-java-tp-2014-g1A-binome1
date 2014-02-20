/* TODO Javadoc. */
package tp1;

public class Pion
{
    /* TODO Pourquoi une chaine ? Est-ce que le nombre de solutions n'est pas connu ? */
    public String couleur;
    /* TODO Pourquoi une chaine ? Est-ce que le nombre de solutions n'est pas connu ? */
    /* TODO Notion d'héritage ? */
    public String element;
    /* TODO Qu'est-ce qu'une case ? */
    private Case Position;
    /* TODO Pourquoi un constructeur vide ? */
    public Pion()
    {

    }
    /* TODO Le pion peut se déplacer n'importe où ? */
    public void avancerPion(Case p)
    {
        this.Position = p;
    }
}
