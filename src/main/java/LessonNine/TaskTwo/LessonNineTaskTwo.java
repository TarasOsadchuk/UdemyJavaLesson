package LessonNine.TaskTwo;

public class LessonNineTaskTwo {

    public static void main(String[] args) {
//        Test1 t = new Test1();
//        t.adc(3);

        Test2 t2 = new Test2();
        t2.adc(5);

        Test3 t3 = new Test3();
        t3.adc(4);
    }
}

//class Test1 {
//
//    int a = 1;
//    static int a = 2;
//
//    void adc(int a) {
//        System.out.println(a);
//        System.out.println(this.a);
//    }
//}

class Test2 {

    int a = 1;
    static int b = 2;

    static void adc(final int a) {
        System.out.println(a);
        System.out.println(Test2.b);
    }
}

class Test3 {

    int a = 1;
    static int b = 2;

    void adc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test3.b);
    }
}
