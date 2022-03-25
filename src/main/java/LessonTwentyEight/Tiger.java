package LessonTwentyEight;

public class Tiger {

    public void eat(String food) {
        if (food.equals("myaso")) {
            System.out.println("Tiger est myaso");
        } else {
            throw new NeMyasoException("Tiger ne est " + food);
        }
    }

    public void drink(String drink) throws NeVodaException {
        if (drink.equals("voda")) {
            System.out.println("Tiger pyet voda");
        } else {
            throw new NeVodaException("Tiger ne pyet " + drink);
        }
    }
}
