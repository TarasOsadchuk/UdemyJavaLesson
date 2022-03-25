package LessonNineteen;

public class LessonNineteenTaskOne {

    public static String[] abc(String... strings) {
        String[] strings1 = new String[strings.length];
        for (int i = 0; i < strings1.length; i++) {
            strings1[i] = strings[i];
        }
        return strings1;
    }

    public static void main(String[] args) {

        String[] strings = abc("taras", "andriy", "inna");
        String[] arg = {"taras", "andriy", "oleg"};

        for (int i = 0; i < strings.length; i++) {
            for (String st1 : arg) {
                if (st1.equals(strings[i])) {
                    strings[i] = null;
                }
            }
        }

        for (String s1 : strings) {
            System.out.print(s1 + " ");
        }
    }
}
