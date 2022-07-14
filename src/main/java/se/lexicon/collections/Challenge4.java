package se.lexicon.collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class Challenge4 {
    public static void run() {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(4);
        numList.add(4);
        numList.add(2);
        numList.add(6);
        numList.add(7);
        System.out.println(numList);
        TreeSet<Integer> numbers = new TreeSet<>(numList);
        System.out.println("numbers.toString() = " + numbers.toString());
    }
}
