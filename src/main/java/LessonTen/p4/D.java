package LessonTen.p4;

import LessonTen.p1.A;
import LessonTen.p1.p2.p3.C;
import LessonTen.p4.p5.E;

import static LessonTen.p1.p2.B.*;

public class D {

    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.a1);
        System.out.println(a.a2);
        System.out.println(a.a3);

        C c = new C();
        System.out.println(c.c1);
        System.out.println(c.c2);
        System.out.println(c.c3);

        E e = new E();
        System.out.println(e.e1);
        System.out.println(e.e2);
        System.out.println(e.e3);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
