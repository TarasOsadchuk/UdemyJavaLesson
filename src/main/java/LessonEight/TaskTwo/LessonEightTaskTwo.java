package LessonEight.TaskTwo;

public class LessonEightTaskTwo {

    static final double PI = 3.14;

    static double areaOfACircle(double radius) {
        return PI * radius * radius;
    }

    static double circumference(double radius) {
        return 2 * PI * radius;
    }

    static void lapInformation(double radius) {
        System.out.println("Radius: " + radius + "\n" +
                        "Area of a circle: " + areaOfACircle(radius) + "\n" +
                        "Circumference: " + circumference(radius));
    }
}

class LessonEightTaskTwoTest {

    public static void main(String[] args) {

        System.out.println(LessonEightTaskTwo.areaOfACircle(4));
        System.out.println(LessonEightTaskTwo.circumference(4));
        LessonEightTaskTwo.lapInformation(4);
    }
}
