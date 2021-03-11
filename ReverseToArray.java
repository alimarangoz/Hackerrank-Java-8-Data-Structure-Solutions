package Hackerrank_week_1;

import java.util.Scanner;

public class ReverseToArray {

    public static int[] reverseToArray(int[] arr){
        Scanner scanner = new Scanner(System.in);
        int numberOfElement = scanner.nextInt();
        arr = new int[numberOfElement];

        for(int i = 0 ; i< arr.length ; i++ ){
            arr[i] = scanner.nextInt();
        }

        int[] newArr = new int[numberOfElement];

        for (int i = 0; i < arr.length ; i++){
            newArr[arr.length - i - 1] = arr[i];
        }

        for (int i = 0; i < arr.length ; i++){
            System.out.print(newArr[i] + "");
        }



        return newArr;

    }




}
