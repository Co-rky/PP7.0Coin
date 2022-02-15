public class Main
{
    public static void main (String[] args)
    {
        MonetaryCoin penny = new MonetaryCoin("penny", 1);
        MonetaryCoin nickel = new MonetaryCoin("nickel", 5);
        MonetaryCoin dime = new MonetaryCoin("dime", 10);
        MonetaryCoin quarter = new MonetaryCoin("quarter", 25);

        int totalVal = penny.getValue() + nickel.getValue() + dime.getValue() + quarter.getValue();

        System.out.println(penny.toString());
        System.out.println("The penny landed on " + penny.flip());
        System.out.println("\n" + nickel.toString());
        System.out.println("The nickel landed on " + nickel.flip());
        System.out.println("\n" + dime.toString());
        System.out.println("The dime landed on " + dime.flip());
        System.out.println("\n" + quarter.toString());
        System.out.println("The quarter landed on " + quarter.flip());
        System.out.println("\nThe total value of the coins is " + totalVal + "¢");
    } // end main method
} // end class Main
