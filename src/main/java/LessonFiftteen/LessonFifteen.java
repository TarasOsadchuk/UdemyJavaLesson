package LessonFiftteen;

public class LessonFifteen {

    public static void time() {

        int hour = 0;
        HOUR:
        while (hour < 6) {
            int minute = -1;
            MINUTE:
            do {
                minute++;
                if (hour > 1 && minute % 10 == 0) {
                    break HOUR;
                }
                int second = 0;
                while (second <= 59) {
                    if (second * hour > minute) {
                        continue MINUTE;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                }
                minute++;
            }
            while (minute < 59);
            hour++;
        }
    }

    public static void main(String[] args) {
        time();
    }
}
