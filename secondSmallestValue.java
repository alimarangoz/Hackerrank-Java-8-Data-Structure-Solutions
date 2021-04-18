package Schedule;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
            //ara değeri bulma
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
        String s = "ali";
        int arr[] = {13,14,15};
        //secondSmallest(arr);
        System.out.println(s.contains("a"));
    }

}

