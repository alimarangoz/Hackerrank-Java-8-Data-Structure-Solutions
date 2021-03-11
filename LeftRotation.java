package Hackerrank_week_1;

import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sequence: ");
        int n = scanner.nextInt() ;
        System.out.println("Enter the rotate number");
        int d = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0 ; i < n ; i++){
            arr[i] = scanner.nextInt();
        }

        int[] newList = new int[n];

        for (int j = 0 ; j < n ; j++){
            if (d+j > n - 1){
                newList[j] = arr[d + j - n];
            }
            else {
                newList[j] = arr[d + j];
            }
        }

        for (int a = 0 ; a < n ; a ++){
            System.out.print(newList[a] + " ");
        }

    }
}
