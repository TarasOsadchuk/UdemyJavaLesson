package LessonThirty;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestEmployee {

    public void printEmployee(Employee e) {

        System.out.println("Name: " + e.name + "\n" +
                "Department: " + e.department + "\n" +
                "Salary: " + e.salary);
    }

    public void filtraciyaRabotnikov(ArrayList<Employee> aL, Predicate<Employee> p) {
        for (Employee e : aL) {
            if (p.test(e)) {
                printEmployee(e);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        Employee e1 = new Employee("Taras", "IT", 450);
        Employee e2 = new Employee("Andriy", "IT", 450);
        Employee e3 = new Employee("Elena", "IT", 150);
        Employee e4 = new Employee("Eva", "Eva", 450);
        Employee e5 = new Employee("Inna", "Inna", 10);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        TestEmployee te = new TestEmployee();

        te.filtraciyaRabotnikov(list, (Employee e) -> e.department.equals("IT") && e.salary > 200);
        System.out.println("___________________");
        te.filtraciyaRabotnikov(list, (Employee e) -> e.name.startsWith("E") && e.salary != 450);
        System.out.println("___________________");
        te.filtraciyaRabotnikov(list, (Employee e) -> e.name.equals(e.department));
    }
}
