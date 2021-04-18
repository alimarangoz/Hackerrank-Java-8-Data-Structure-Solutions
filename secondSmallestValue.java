

public class secondSmallestValue {
        static void secondSmallest(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int arr_size = arr.length;


        for (int i = 0; i < arr_size ; i ++) {

            if (arr[i] < smallest)
            {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            
            else if (arr[i] < secondSmallest && arr[i] != smallest)
                secondSmallest = arr[i];
        }

        if (secondSmallest == Integer.MAX_VALUE)
            System.out.println("There is no secondSmallest smallest element");
        else
            System.out.println(secondSmallest);
    }

    public static void main (String[] args)
    {
        int arr[] = {13,13,15,14,15};
        System.out.println(secondSmallest(arr););
    }

}

