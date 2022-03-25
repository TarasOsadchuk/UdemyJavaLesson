package LessonSeven;

public class EmployeeLessonSeven {

    int id;
    public String surname;
    private double salary;

    private EmployeeLessonSeven(double salary) {
        this.salary = salary;
    }

    EmployeeLessonSeven(int id) {
        this.id = id;
    }

    public EmployeeLessonSeven(String surname) {
        this.surname = surname;
    }

    public void getSalary() {
        System.out.println("Salary: " + salary);
    }

    public void getId() {
        System.out.println("ID: " + id);
    }

    public void getSurname() {
        System.out.println("Surname: " + surname);
    }
}

class EmployeeLessonSevenTest {

    public static void main(String[] args) {

        //EmployeeLessonSeven employeeLessonSevenOne = new EmployeeLessonSeven(15_500.0);
        EmployeeLessonSeven employeeLessonSevenTwo = new EmployeeLessonSeven(2);
        EmployeeLessonSeven employeeLessonSevenThree = new EmployeeLessonSeven("Osadchuk");

        employeeLessonSevenTwo.getSalary();
        employeeLessonSevenTwo.getId();
        employeeLessonSevenTwo.getSurname();

        employeeLessonSevenThree.getSalary();
        employeeLessonSevenThree.getId();
        employeeLessonSevenThree.getSurname();

    }
}