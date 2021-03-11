package Hackerrank_week_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumbers {
    static int[] missingNumbers(int[] arr, int[] brr) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < brr.length; i++){
            list.add(brr[i]);
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == list.get(j)){
                    list.remove(Integer.valueOf(arr[i]));//Integer because i store the numbers as an Integer.
                    //It returns a Integer instance representing the specified int value

                    break;
                }
            }
        }
        List<Integer> finalreal = list.stream().distinct().collect(Collectors.toList());

        int[] myArray = new int[finalreal.size()];
        for(int h = 0; h < finalreal.size(); h++){
            myArray[h] = finalreal.get(h);
        }
        Arrays.sort(myArray);
        return myArray;




    }
}
