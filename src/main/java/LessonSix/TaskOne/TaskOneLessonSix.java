package LessonSix.TaskOne;

public class TaskOneLessonSix {

     int sum() {
        int result = 0;
        System.out.println("Sum of numbers: " + result);
        return result;
    }

    int sum(int numOne) {
        int result = numOne;
        System.out.println("Sum of numbers: " + result);
        return result;
    }

    int sum(int numOne, int numTwo) {
        int result = numOne + numTwo;
        System.out.println("Sum of numbers: " + result);
        return result;
    }

    int sum(int numOne, int numTwo, int numThree) {
        int result = numOne + numTwo + numThree;
        System.out.println("Sum of numbers: " + result);
        return result;
    }

    int sum(int numOne, int numTwo, int numThree, int numFour) {
        int result = numOne + numTwo + numThree + numFour;
        System.out.println("Sum of numbers: " + result);
        return result;
    }
}

class TaskOneLessonSixTest {

    public static void main(String[] args) {

        TaskOneLessonSix taskOne = new TaskOneLessonSix();

        taskOne.sum();
        taskOne.sum(1);
        taskOne.sum(3, 4);
        taskOne.sum(5, 6, 7);
        taskOne.sum(8, 9, 10, 11);

    }
}
