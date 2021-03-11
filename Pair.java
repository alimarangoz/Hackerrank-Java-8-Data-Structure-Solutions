package Hackerrank_week_3;

import java.util.HashSet;

public class Pair {
    static int pairs(int k, int[] arr) {
        HashSet<Integer> hset = new HashSet<>(); // it can check the object if it is in the set or not.
        int counter = 0;
        for(int i : arr){
            hset.add(i);
        }
        for(int j : hset){
            if(hset.contains(j+k)){
                counter+=1;
            }
        }
        return counter;

    }
    // The below code gives timeout error because of time complexity. O(n^2)
    /*int count = 0;
        for(int i = 0; i < arr.length; i++){
        for(int j = i; j < arr.length; j++){
            if(Math.abs(arr[i] - arr[j]) == k){
                //condition
                ++count;
                //break;
            }
        }
    }
        return count;*/

}
