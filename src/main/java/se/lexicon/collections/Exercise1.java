package se.lexicon.collections;

import java.util.LinkedList;

public class Exercise1 {
    public static LinkedList<String> generateWeekList(){
        LinkedList<String> weekDays = new LinkedList<>();
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
