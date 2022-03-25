package LessonTwo;

public class LessonTwo {
    public static void main(String[] args) {
        // Task one
        byte testByteOne = 0b1100;
        byte testByteTwo = 0_14;
        byte testByteThree = 12;
        byte testByteFour = 0xC;

        short testShortOne = 0b0101_0001_0100;
        short testShortTwo = 0_2_424;
        short testShortThree = 1300;
        short testShortFour = 0x514;

        int testIntOne = 0b0;
        int testIntTwo = 0_0;
        int testIntThree = 0;
        int testIntFour = 0x0;

        long testLongOne = 0b0111_0101_1011_1100_1101_0001_0101L;
        long testLongTwo = 0_726_746_425L;
        long testLongThree = 123_456_789L;
        long testLongFour = 0x75BCD15L;

        System.out.println(testByteOne + "\n" +
                testByteTwo + "\n" +
                testByteThree + "\n" +
                testByteFour + "\n");

        System.out.println(testShortOne + "\n" +
                testShortTwo + "\n" +
                testShortThree + "\n" +
                testShortFour + "\n");

        System.out.println(testIntOne + "\n" +
                testIntTwo + "\n" +
                testIntThree + "\n" +
                testIntFour + "\n");

        System.out.println(testLongOne + "\n" +
                testLongTwo + "\n" +
                testLongThree + "\n" +
                testLongFour + "\n");

        // Task two
        float testFloatOne = 12.34F;
        float testFloatTwo = 56.789f;

        double testDoubleOne = 98.76;
        double testDoubleTwo = 54.321;

        boolean booleanTrue = true;
        boolean booleanFalse = false;

        System.out.println(testFloatOne + "\n" +
                testFloatTwo + "\n");

        System.out.println(testDoubleOne + "\n" +
                testDoubleTwo + "\n");

        System.out.println(booleanTrue + "\n" +
                booleanFalse + "\n");

        // Task Three
        char testCharOne = '$';
        char testCharTwo = 36;
        char testCharThree = '\u0024';

        System.out.println(testCharOne + "\n" +
                testCharTwo + "\n" +
                testCharThree + "\n");
    }
}
