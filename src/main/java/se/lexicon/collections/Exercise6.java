package se.lexicon.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Exercise6 {
    public static void run() {
        HashSet<String> setOfDays = new HashSet<String>();
        setOfDays.addAll(Exercise1.generateWeekList());
        ArrayList<String> test = new ArrayList<>(setOfDays);
        System.out.println(test);
    }
}
