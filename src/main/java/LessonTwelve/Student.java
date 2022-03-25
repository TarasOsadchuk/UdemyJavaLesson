package LessonTwelve;

public class Student {

    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
}

class StudentTest {

    void nameSimile(Student s1, Student s2) {
        if (s1.name.equals(s2.name) && s1.course == s2.course && s1.grade == s2.grade)
            System.out.println("Students are equal!");
        else
            System.out.println("Students are not equal");
    }

    void studentSimile(Student s1, Student s2) {
        if (s1.name.equals(s2.name) && s1.course == s2.course && s1.grade == s2.grade) {
            System.out.println("Students are completely equal");
        } else if (s1.name.equals(s2.name)) {
            if (s1.course == s2.course) {
                System.out.println("Students are equal in names and courses");
            } else if (s1.grade == s2.grade) {
                System.out.println("Students are equal in names and grades");
            } else {
                System.out.println("Students are equal only in names");
            }
        } else if (s1.course == s2.course) {
            if (s1.grade == s2.grade) {
                System.out.println("Students are equal in courses and grades");
            } else {
                System.out.println("Students are equal only in courses");
            }
        } else if (s1.grade == s2.grade) {
            System.out.println("Students are equal only in grades");
        } else {
            System.out.println("Students are not equal");
        }
    }

    public static void main(String[] args) {

        StudentTest studentTest = new StudentTest();
        Student studentOne = new Student("Andriy", 1, 9.5);
        Student studentTwo = new Student("Taras", 2, 9.5);

        studentTest.nameSimile(studentOne, studentTwo);
        studentTest.studentSimile(studentOne, studentTwo);
    }
}