package se.lexicon.collections;

import java.util.HashSet;
import java.util.LinkedList;

public class Challenge1 {
    public static void run() {
        LinkedList<String> weekDays = Exercise1.generateWeekList();
        HashSet<String> weekSet = new HashSet<>(weekDays);
        HashSet<String> weekendSet = new HashSet<>();
        weekendSet.add("Sunday");
        weekendSet.add("Saturday");
        HashSet<String> unionSet = new HashSet<>();
        for(String s : weekSet){
            for(String p : weekendSet){
                if(s.equals(p)){
                    unionSet.add(s);
                }
            }
        }
        System.out.println(unionSet);
    }
}
