package LessonTwentyFour;

public class Lev extends Mammal {

    public Lev(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Lev, kak lyuboy xishnik, lyubit myaso!");
    }

    @Override
    public void sleep() {
        System.out.println("Bolshuyu chast dnya lev spit!");
    }

    @Override
    public void run() {
        System.out.println("Lev-eto ne samaya bistraya koshka!");
    }
}
