package LessonEleven;

public class Car {

    public String color;
    public String motor;
    public int numberOfDoors;

    public Car(String color, String motor, int numberOfDoors) {

        this.color = color;
        this.motor = motor;
        this.numberOfDoors = numberOfDoors;
    }

    public void carInfo() {
        System.out.println("Color: " + color + "\n" +
                "Motor: " + motor + "\n" +
                "Number of doors: " + numberOfDoors + "\n");
    }
}

class CarTest {

    void changesInTheNumberOfDoors(Car carOne, int change) {

        carOne.numberOfDoors = change;
    }

    void changesColor(Car carOne, Car carTwo) {

        String color = carOne.color;
        carOne.color = carTwo.color;
        carTwo.color = color;
    }

    public static void main(String[] args) {

        Car carOne = new Car("Red", "V8", 2);
        Car carTwo = new Car("Black", "V6", 4);
        CarTest carTest = new CarTest();

        carOne.carInfo();
        carTwo.carInfo();

        carTest.changesInTheNumberOfDoors(carOne, 4);
        carTest.changesColor(carOne, carTwo);

        carOne.carInfo();
        carTwo.carInfo();
    }
}
