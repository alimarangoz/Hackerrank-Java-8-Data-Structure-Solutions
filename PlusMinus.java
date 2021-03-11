package Hackerrank_week_2;

public class PlusMinus {

    static void plusMinus(int[] arr) {

        double p = 0;
        double neg = 0;
        double z = 0;

        for(int i = 0 ; i < arr.length;i++){
            if(arr[i]>0){
                p += 1;

            }else if(arr[i]< 0){
                neg += 1;
            }else{
                z+=1;
            }
        }

        System.out.println(p/arr.length);
        System.out.println(neg/arr.length);
        System.out.println(z/arr.length);

    }
}
