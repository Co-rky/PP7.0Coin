public class Coin
{
    // instance variables
    public String name;

    // constructors
    public Coin(String name)
    {
        this.name = name;
    }

    // getters
    public String getName()
    {
        return name;
    }

    // setters
    public void setName(String name)
    {
        this.name = name;
    }

    private final int HEADS = 0;
    private int face;
    private String faceName;

    public Coin()
    {
        flip();
    }

    public String flip()
    {
        face = (int)(Math.random() * 2);
        if (face == HEADS)
            faceName = "Heads";
        else
            faceName = "Tails";
        return faceName;
    }

    // toString
    public String toString()
    {
        String output = "The name of the coin is " + name;
        return output;
    }
}
