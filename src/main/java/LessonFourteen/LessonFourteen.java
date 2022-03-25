package LessonFourteen;

public class LessonFourteen {

    public static void time() {

        HOUR:
        for (int hour = 0; hour <= 5; hour++) {
            MINUTE:
            for (int minute = 0; minute <= 59; minute++) {
                if (hour > 1 && minute > 0 && minute % 10 == 0) {
                    break HOUR;
                }
                for (int second = 0; second <= 59; second++) {
                    if (second * hour > minute) {
                        continue MINUTE;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
