package Hackerrank_week_2;

import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        
        
        int counter = 0;
        int max = 1;
        for(int i = 0 ; i < candles.size() ;i++ ){
            if(max <= candles.get(i)){
                max = candles.get(i);
            }
        }
        for(int i = 0 ; i < candles.size() ;i++ ){
            if(max == candles.get(i)){
                counter += 1;
            }
        }

        return counter;

    }
}
