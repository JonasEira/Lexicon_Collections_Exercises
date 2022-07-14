package se.lexicon.collections;

import java.util.HashMap;

public class Exercise12 {
    public static void run() {
        Car volvo = new Car(1, "Volvo", "XC60");
        HashMap<Integer, Car> carMap = new HashMap<>();
        carMap.put(1, volvo);
        System.out.println(carMap.get(1).getBrand());
    }
}
