package se.lexicon.collections;

import java.util.List;

public class Exercise2 {
    public static void run() {
        List<String> weekDays = Exercise1.generateWeekList();
        for(String day : weekDays){
            System.out.println(day);
        }
    }
}
