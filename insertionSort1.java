package Hackerrank_week_4;

public class insertionSort1 {

    static void insertionSort1(int n, int[] arr) {
        int temp = arr[n-1];
        for(int i = n-1 ; i > 0   ; i--){
            if(temp < arr[i-1]){
                if (i == 1){
                    arr[1] = arr[0];
                    arr[0] = temp;
                    break;
                }
                arr[i] = arr[i - 1];
            }else{
                arr[i] = temp;
                break;
            }

            for(int j = 0 ; j < arr.length ; j++){
                System.out.print(arr[j] +" ");
            }
            System.out.println();
        }
        for(int a = 0 ; a < arr.length ; a++){

           if(arr[0] == arr[1]){
                arr[0] = temp;
                System.out.print(arr[a] +" ");
                a++;
            }

            System.out.print(arr[a] +" ");
        }

    }

    public static void main(String[] args) {
        int n = 10 ;
        int[] arr = {2,3,4,5,6,7,8,9,10,1};
        insertionSort1(n,arr);
    }
}