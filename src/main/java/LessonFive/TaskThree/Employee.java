package LessonFive.TaskThree;

public class Employee {

    int id;
    String surname;
    int age;
    int salary;
    String department;

    Employee(int id,
             String surname,
             int age,
             int salary,
             String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    void plusSalary() {
        salary += salary;
    }
}

class EmployeeTest {

    public static void main(String[] args) {

        Employee employeeOne = new Employee(
                1,
                "Osadchuk",
                20,
                8_500,
                "Programmer");
        Employee employeeTwo = new Employee(
                2,
                "Boyko",
                45,
                10_700,
                "Better programmer");

        System.out.println("Salary " + employeeOne.surname + ": " + employeeOne.salary);
        System.out.println("Salary " + employeeTwo.surname + ": " + employeeTwo.salary);

        employeeOne.plusSalary();
        employeeTwo.plusSalary();

        System.out.println("Salary " + employeeOne.surname + ": " + employeeOne.salary);
        System.out.println("Salary " + employeeTwo.surname + ": " + employeeTwo.salary);
    }
}

