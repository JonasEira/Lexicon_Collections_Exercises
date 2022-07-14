package se.lexicon.collections;

import java.util.HashMap;

public class Exercise9_10_11 {
    public static void run() {
        HashMap<Integer, String> carMap = new HashMap<Integer, String>();
        carMap.put(1, "Volvo");
        carMap.put(2, "Opel");
        carMap.put(3, "Audi");
        System.out.println(carMap);
        System.out.println(carMap.keySet());
        System.out.println(carMap.values());

    }
}
