package Hackerrank_week_1;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];

        System.out.println("Enter the elements 6x6");

        for(int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j<arr.length;j++){
                arr[i][j] = scanner.nextInt();

            }
        }

        int sum = 0;
        int maxSum = -63; // elements should be between -9 and 9
        for(int i = 0 ; i < 4 ; i++){
            for (int j = 0 ; j < 4 ; j++){
                sum = arr[i][j]+ arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] +
                        arr[i + 2][j + 1] +arr[i + 2][j+2];

                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);


    }
}
