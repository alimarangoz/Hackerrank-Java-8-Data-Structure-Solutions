package Hackerrank_week_4;

public class countingShort1 {
    static int[] countingSort(int[] arr) {

        int[] answer = new int[100];

        for(int i = 0  ; i < arr.length ; i++){
            answer[arr[i]]++;
        }

        return answer;

    }
}
