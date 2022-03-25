package LessonTwentyFour;

public class Main {

    public static void main(String[] args) {

        // #1
        Mechenosec mechenosec = new Mechenosec("Mache");
        System.out.println(mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();
        System.out.println("***");

        // #2
        Speakable speakable = new Pingvin("Pingvi");
        speakable.speak();
        System.out.println("***");

        // #3
        Animal animal = new Lev("Alex");
        System.out.println(animal.name);
        animal.eat();
        animal.sleep();
        System.out.println("***");

        // #4
        Mammal mammal = new Lev("Aslan");
        System.out.println(mammal.name);
        mammal.eat();
        mammal.speak();
        mammal.sleep();
        mammal.run();
    }
}
