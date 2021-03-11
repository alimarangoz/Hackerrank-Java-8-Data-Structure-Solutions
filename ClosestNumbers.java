package Hackerrank_week_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestNumbers {
    static int[] closestNumbers(int[] arr) {
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        int difference = 10000000;
        for(int i = 1 ; i < arr.length-1 ;i++){
            int distance = Math.abs(arr[i+1]-arr[i]);
            if( distance < difference ){
                difference = distance;
                list.clear();
                list.add(arr[i]);
                list.add(arr[i+1]);

            }else if (distance == difference){
                list.add(arr[i]);
                list.add(arr[i+1]);
            }



        }
        int[] answer = new int[list.size()];
        for(int i = 0 ; i < answer.length;i++){
            answer[i] = list.get(i);
        }

        return answer;

    }
}
