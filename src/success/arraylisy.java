package success;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class arraylisy {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Tigor");
        cars.add("Innova");
        cars.add("Ferrari");
        cars.add("Fortuner");
        cars.add(0,"Alto");
        System.out.println(cars.contains("ortuner"));
        System.out.println(cars);

        System.out.println(cars.set(2, "Tiago"));

        System.out.println(cars);




    }
}
