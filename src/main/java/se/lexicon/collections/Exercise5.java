package se.lexicon.collections;

import java.util.HashSet;

public class Exercise5 {
    public static void run() {
        HashSet<String> setOfDays = new HashSet<String>();
        setOfDays.addAll(Exercise1.generateWeekList());
        System.out.println("setOfDays.toString() = " + setOfDays.toString());;
    }
}
