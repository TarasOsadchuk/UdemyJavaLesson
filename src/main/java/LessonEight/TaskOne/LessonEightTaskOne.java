package LessonEight.TaskOne;

public class LessonEightTaskOne {

    static int threeNumbers(int numOne, int numTwo, int numThree) {
        return numOne * numTwo * numThree;
    }

    static void twoNumbers(int numOne, int numTwo) {
        System.out.println("Division " + numOne + " by " + numTwo + "\n" +
                "Whole part: " + (numOne / numTwo) + "\n" +
                "Remainder from division: " + (numOne % numTwo));
    }
}

class LessonEightTaskOneTest {

    public static void main(String[] args) {

        System.out.println(LessonEightTaskOne.threeNumbers(2, 3, 2));
        System.out.println(LessonEightTaskOne.threeNumbers(1, 2, 3));

        LessonEightTaskOne.twoNumbers(2, 4);
        LessonEightTaskOne.twoNumbers(34, 3);
    }
}
