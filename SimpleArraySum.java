package Hackerrank_week_2;

import java.util.Scanner;

public class SimpleArraySum {
    public static int sum(){
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[scanner.nextInt()];

        for(int i = 0; i<array.length;i++)
            array[i] = scanner.nextInt();

        int sum = 0;

        for ( int count = 0 ; count < array.length ; count++)
            sum = sum + array[count];
        System.out.println(sum);

        return sum;
    }

    public static void main(String[] args) {
        sum();
    }
}
