public class MonetaryCoin extends Coin
{
    // instance variables
    public int value;

    // constructors
    public MonetaryCoin(String name, int value)
    {
        super(name);
        this.value = value;
    }

    // getters
    public int getValue()
    {
        return value;
    }

    // setters
    public void setValue(int value)
    {
        this.value = value;
    }

    // toString
    public String toString()
    {
        String output = "The name of the coin is " + name +
                        "\nThe value of the coin is " + value + "¢";
        return output;
    }
} // end class MonetaryCoin
