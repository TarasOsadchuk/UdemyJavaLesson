package LessonTwentyFive;

import LessonTwentyFour.*;

public class LessonTwentyFive {

    public static void main(String[] args) {

        Animal a1 = new Mechenosec("Mechen");
        Animal a2 = new Pingvin("Ping");
        Animal a3 = new Lev("lion");
        Fish f1 = new Mechenosec("Mech");
        Bird b1 = new Pingvin("Pingvi");
        Mammal m1 = new Lev("Alex");
        Mechenosec mech1 = new Mechenosec("Mechen");
        Pingvin p1 = new Pingvin("Pipi");
        Lev l1 = new Lev("L");

        Speakable s1 = new Pingvin("PipiTwo");
        Speakable s2 = new Lev("Ooooo");

        Animal[] array1 = {a1, a2, a3, f1, b1, m1, mech1, p1, l1};
        Speakable[] array2 = {s1, s2, b1, p1, l1};

        for (Animal a : array1) {
            if (a instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.eat();
                m.swim();
                m.sleep();
            } else if (a instanceof Pingvin) {
                Pingvin p = (Pingvin) a;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if (a instanceof Lev) {
                Lev l = (Lev) a;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            }
            System.out.println("----------------------------");
        }

        for (Speakable s : array2) {
            if (s instanceof Pingvin) {
                Pingvin p = (Pingvin) s;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if (s instanceof Lev) {
                Lev l = (Lev) s;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();

            }
            System.out.println("----------------------------");
        }
    }
}
