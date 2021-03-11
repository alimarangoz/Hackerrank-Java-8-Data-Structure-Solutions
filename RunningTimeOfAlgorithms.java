package Hackerrank_week_4;

public class RunningTimeOfAlgorithms {
    static int runningTime(int[] arr) {
        int n = arr.length;
        int shift = 0;
        int temp = arr[0];
        for (int i = 0; i < n-1; i++){
            if(temp < arr[i+1]){
                temp = arr[i+1];

            }else{
                int var = 0;
                for (int j = i; j >= 0; j--) {
                    if (arr[j+1] < arr[j]){
                        var = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = var;
                        shift++;
                    }

                }

            }
        }
        return shift;

    }
}
