package se.lexicon.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Exercise8 {
    public static void run() {
        HashSet<String> names = Exercise7.generateNames();
        TreeSet<String> sortedNames = new TreeSet<>(names);
        System.out.println(sortedNames);


    }
}
