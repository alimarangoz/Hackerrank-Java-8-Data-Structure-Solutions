package Hackerrank_week_2;

import java.util.List;

public class DiagonalDifferences {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0 ; i < arr.size(); i++){
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(i).get(arr.size() - 1 - i);
        }

        return Math.abs(sum1 - sum2);

    }
}
