package Hackerrank_week_4;

import java.util.Arrays;
import java.util.Comparator;

public class BigShorting {
    static String[] bigSorting(String[] unsorted) {
        Comparator<String> strComp = Comparator.comparing(String::length).thenComparing
                (String::toString,(s1,s2) ->{return s1.compareTo(s2);});

        Arrays.sort(unsorted,strComp);

        return unsorted;


    }
}
