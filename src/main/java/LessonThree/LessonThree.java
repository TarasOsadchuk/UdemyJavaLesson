package LessonThree;

public class LessonThree {
    public static void main(String[] args) {
        // Task one
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20;
        double result = i2 / d1 + d2 % i1 - l;
        System.out.println(result);

        // Task two
        int a = 5;
        int b = 8;

        int resultA = a-- - --a + ++a + a++ + a;
        // 5 - 3 + 4 + 4 + 5 = 15
        int resultB = ++b - b++ + ++b - --b;
        // 9 - 9 + 11 - 10 = 1

        System.out.println(resultA);
        System.out.println(resultB);
    }
}
