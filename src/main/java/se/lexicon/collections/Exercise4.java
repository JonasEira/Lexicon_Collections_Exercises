package se.lexicon.collections;

import java.util.LinkedList;
import java.util.List;

public class Exercise4 {
    public static void run() {
        LinkedList<String> weekDays = Exercise1.generateWeekList();
        List<String> newWeekDays = weekDays.subList(0,3);
        System.out.println(newWeekDays);
    }
}
