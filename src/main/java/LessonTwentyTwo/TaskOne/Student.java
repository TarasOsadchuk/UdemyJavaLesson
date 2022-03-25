package LessonTwentyTwo.TaskOne;

public class Student {

    private StringBuilder name;
    private int course;
    private double grade;

    public void showInfo() {
        System.out.println("Student:\n"
                + "Name - " + getName() + "\n"
                + "Course - " + getCourse() + "\n"
                + "Grade - " + getGrade());
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade > 0 && grade <= 10) {
            this.grade = grade;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course > 0 && course <= 4) {
            this.course = course;
        }
    }

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return name;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }
}

class TestStudent {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName(new StringBuilder("Taras"));
        student.setCourse(3);
        student.setGrade(7.6);

        student.showInfo();
    }
}