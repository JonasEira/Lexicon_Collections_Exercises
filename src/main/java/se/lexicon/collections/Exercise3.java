package se.lexicon.collections;

import java.util.LinkedList;
import java.util.List;

public class Exercise3 {
    public static void run() {
        LinkedList<String> weekDays = Exercise1.run();
        weekDays.remove(3);
        System.out.println(weekDays);
        weekDays.add(3,"Thursday");
        System.out.println(weekDays);
    }
}
