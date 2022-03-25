package LessonTwentyFour;

public abstract class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}
