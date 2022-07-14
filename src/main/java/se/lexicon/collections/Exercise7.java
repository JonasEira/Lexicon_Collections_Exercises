package se.lexicon.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Exercise7 {
    public static void run() {
        HashSet<String> names = new HashSet<String>();
        names.add("Name1");
        names.add("Name2");
        names.add("Name4");
        names.add("Name3");
        names.add("Name5");
        names.add("Name6");
        ArrayList<String> namesList = new ArrayList<String>(names);
        Collections.sort(namesList);
        System.out.println(namesList);
     }
}
