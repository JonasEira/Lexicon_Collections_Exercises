package se.lexicon.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge3 {
    public static void run() {
        SuperHero sh = new SuperHero(1, "Jonas Eira", 40);
        SuperHero sh2 = new SuperHero(2, "Someone", 30);
        ArrayList<SuperHero> test = new ArrayList<>();
        test.add(sh);
        test.add(sh2);
        System.out.println(test);
        Collections.sort(test);
        System.out.println(test);
    }
}
