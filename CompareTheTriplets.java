package Hackerrank_week_2;

import java.util.Scanner;

public class CompareTheTriplets {
    public static int[] compareTriplets() {

        int[] a = new int[3];
        int[] b = new int[3];

        int [] result = new int[2];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0;i<3;i++)
            a[i] = scanner.nextInt();

        for (int i = 0;i<3;i++)
            b[i] = scanner.nextInt();



        for (int i = 0 ; i<3;i++){
            if (a[i] > b[i])
                result[0] += 1;
            else if (a[i] < b[i])
                result[1] += 1;



        }
        System.out.println(result[0] + " " +result[1]);

        return result;
    }

    public static void main(String[] args) {
        compareTriplets();
    }
}
