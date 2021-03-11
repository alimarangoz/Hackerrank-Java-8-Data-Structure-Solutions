package Hackerrank_week_2;

public class TimeConversion {
    static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        int minute = Integer.parseInt(s.substring(3, 5));
        int second = Integer.parseInt(s.substring(6, 8));
        String lastWord = s.substring(8, 10);

        hour += ((lastWord.equals("PM") && hour != 12) ? 12 : 0);
        hour -= ((lastWord.equals("AM") && hour == 12) ? 12 : 0);

        return (String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second));
    }
}
