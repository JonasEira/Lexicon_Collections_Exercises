package se.lexicon.collections;

import java.util.LinkedList;
import java.util.List;

public class Exercise1 {
    public static List<String> run(){
        List<String> weekDays = new LinkedList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        return weekDays;
    }
}
