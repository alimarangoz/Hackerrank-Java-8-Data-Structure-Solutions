package Hackerrank_week_1;
import java.util.ArrayList;
import java.util.List;

public class DynamicArray {
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

        List<List<Integer>> seqList = new ArrayList<>();
        int lastAnswer = 0;
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            seqList.add(new ArrayList<>());
        }

        for (int i = 0; i < queries.size(); i++) {
            List<Integer> query = queries.get(i);
            int q = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            List<Integer> seq = seqList.get((x ^ lastAnswer) % n);

            if (q == 1) {
                seq.add(y);
            } else {
                int size = seq.size();
                lastAnswer = seq.get(y % size);
                answer.add(lastAnswer);
            }
        }

        return answer;

    }
}