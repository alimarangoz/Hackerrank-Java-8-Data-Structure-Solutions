package Hackerrank_week_4;

public class insertionSort2 {
    static void insertionSort2(int n, int[] arr) {

        int temp = arr[0];
        for (int i = 0; i < n-1; i++){
            if(temp < arr[i+1]){
                temp = arr[i+1];
                print(arr);
            }else{
                int var = 0;
                for (int j = i; j >= 0; j--) {
                    if (arr[j+1] < arr[j]){
                        var = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = var;
                    }

                }
                print(arr);
            }
        }

    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length  ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1};
        int n = arr.length;
        insertionSort2(n,arr);
    }

}
