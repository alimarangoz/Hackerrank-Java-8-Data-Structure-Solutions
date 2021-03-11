package Hackerrank_week_3;

import java.util.List;

public class SherlockAndArray {
    static String balancedSums(List<Integer> arr) {
        if(arr.size()==1) return "YES";

        int sum = 0;
        int right = 0;

        for(int i : arr){
            sum += i;
        }
        // right = a , left = a , middle = b
        // 2a + b = sum
        // 2a = sum - b (a can be both right and left.)
        for(int j : arr){
            if(2*right == sum - j){
                return "YES";
            }else{
                right += j;
            }

        }
        return "NO";

    }
}
