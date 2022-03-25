package LessonTwentyFour;

public abstract class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("Vsegda interesno nablydat," +
                "kak spyat ribi");
    }

    abstract void swim();
}
