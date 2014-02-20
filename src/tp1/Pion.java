/* TODO Javadoc. */
package tp1;

public class Pion
{

    public String couleur;

    public String element;

    private Case Position;

    public Pion()
    {

    }

    public void avancerPion(Case p)
    {
        this.Position = p;
    }
}
