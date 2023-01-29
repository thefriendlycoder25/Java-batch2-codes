package success;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> airlines = new LinkedList<>();

        airlines.add("SpiceJet");
        airlines.add("Air India");
        airlines.add("Indigo");
        airlines.add("Air India");

        System.out.println(airlines);
        System.out.println(airlines.removeFirstOccurrence("ir India"));
        System.out.println(airlines);




    }
}
