package Hackerrank_week_2;

import java.util.Scanner;

public class aVeryBigSum {

    public static long sum(){
        Scanner scanner = new Scanner(System.in);

        long[] array = new long[scanner.nextInt()];

        for(int i = 0; i<array.length;i++)
            array[i] = scanner.nextInt();

        long sum = 0;

        for ( int count = 0 ; count < array.length ; count++)
            sum = sum + array[count];

        System.out.println(sum);

        return sum;
    }
}
