package Hackerrank_week_4;

import java.util.ArrayList;
import java.util.List;

public class countingShort2 {
    static int[] countingSort(int[] arr) {
        int[] answer = new int[100];


        List<Integer> result = new ArrayList<>();

        for(int i = 0  ; i < arr.length ; i++){

            answer[arr[i]] = (answer[arr[i]])+1;
        }

        for(int i = 0 ; i < answer.length ; i++){
            int numberCount = answer[i];
            if(numberCount > 0){

                for(int j = 0; j<numberCount; j++){
                    result.add(i);

                }


            }


        }
        int[] finalAnswer = new int[result.size()];

        for(int i = 0 ; i < result.size();i++){

            finalAnswer[i] = result.get(i);

        }


        return finalAnswer;


    }
}
