package success;

import java.util.Vector;

public class vectors {
    public static void main(String[] args) {
        Vector<String> airlines = new Vector<String>();

        airlines.add("Air India");
        airlines.add("Indigo");
        airlines.add("Vistara");
        airlines.add("SpiceJet");
        System.out.println(airlines);
        airlines.remove(2);
        airlines.remove("SpiceJet");
        System.out.println(airlines);

        System.out.println(airlines.contains("Emirates"));//returns false

    }
}
