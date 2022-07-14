package se.lexicon.collections;

import java.util.HashMap;
import java.util.Set;

public class Challenge2 {
    public static void run() {

        HashMap<String, String> nameMap = new HashMap<>();
        nameMap.put("jonas.eira@gmail.com", "Jonas Eira");
        nameMap.put("lars.krok@gmail.com", "Lars Krok");
        nameMap.put("börje.börjesson@gmail.com", "Börje Börjesson");
        Set<String> emails = nameMap.keySet();
        System.out.println("emails = " + emails);
    }
}
