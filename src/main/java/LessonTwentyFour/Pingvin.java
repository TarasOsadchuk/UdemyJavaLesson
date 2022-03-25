package LessonTwentyFour;

public class Pingvin extends Bird {

    public Pingvin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Pingvin lyubit est ribu!");
    }

    @Override
    public void sleep() {
        System.out.println("Pingvin spuat prijavshis drug k drugu!");
    }

    @Override
    public void fly() {
        System.out.println("Pingvin ne umeyut letat!");
    }
}
