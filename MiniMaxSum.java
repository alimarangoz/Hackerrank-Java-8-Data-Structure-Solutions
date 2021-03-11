package Hackerrank_week_2;

public class MiniMaxSum {
    static void miniMaxSum(int[] arr) {

        long maxSum = 0;
        long minSum = 0;
        long sum = 0;
        long min = 1000000000;
        long max = 1;


        for(int i = 0 ; i < arr.length; i++ ){
            if(arr[i] >= max){
                max = arr[i];

            }
            if(arr[i] <= min ){
                min = arr[i];
            }
            sum += arr[i];
        }

        maxSum = sum - min;
        minSum = sum - max;

        System.out.println(minSum + " " + maxSum);





    }
}
