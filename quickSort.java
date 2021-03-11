package Hackerrank_week_4;

import java.util.ArrayList;
import java.util.List;

public class quickSort {
    static int[] quickSort(int[] arr) {
        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int[] answer = new int[arr.length];
        

        int p = arr[0];

        for(int i = 0 ; i < arr.length ;i++){
            if(arr[i]>p){
                right.add(arr[i]);
            }else if(arr[i]< p){
                left.add(arr[i]);
            }else{
                equal.add(arr[i]);
            }
        }
        for(int i = 0 ; i < left.size() ;i++){
            answer[i] = left.get(i);
        }
        for(int i = 0 ; i < equal.size() ;i++){
            answer[i+left.size()] = equal.get(i);
        }
        for(int i = 0 ; i < right.size() ;i++){
            answer[i+left.size()+equal.size()] = right.get(i);
        }

        return answer;


    }


}
