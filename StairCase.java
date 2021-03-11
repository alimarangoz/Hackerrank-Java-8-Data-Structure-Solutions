package Hackerrank_week_2;

public class StairCase {
    public static void main(String[] args) {

        int n = 3;
        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < n ; i++){
            sb.append(" ");
        }

        int j = 0;
        for (int i = 1; i <= n; i++) {
            sb.replace(sb.length()-i, sb.length() - j, "#");
            System.out.println(sb);
            j++;
        }

    }
}
