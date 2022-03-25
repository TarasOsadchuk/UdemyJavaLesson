package LessonSix.TaskTwo;

public class StudentLessonSix {

    int studentID;
    String name;
    String surname;
    int yearOfStudy;
    double gradeMath;
    double gradeEconomy;
    double gradeForeignLanguage;

    StudentLessonSix(int studentID,
                     String name,
                     String surname,
                     int yearOfStudy,
                     double gradeMath,
                     double gradeEconomy,
                     double gradeForeignLanguage) {
        this.studentID = studentID;
        this.name = name;
        this.surname = surname;
        this.yearOfStudy = yearOfStudy;
        this.gradeMath = gradeMath;
        this.gradeEconomy = gradeEconomy;
        this.gradeForeignLanguage = gradeForeignLanguage;
    }

    StudentLessonSix(int studentID,
                     String name,
                     String surname,
                     int yearOfStudy) {
        this(studentID, name, surname, yearOfStudy, 0.0, 0.0, 0.0);
    }

    StudentLessonSix() {
    }

    double averageRating() {
        return (gradeMath + gradeEconomy + gradeForeignLanguage) / 3;
    }
}

class StudentTestLessonFive {

    public static void main(String[] args) {

        StudentLessonSix studentOne = new StudentLessonSix(
                1,
                "Taras",
                "Osadchuk",
                2021,
                4.5,
                3.8,
                4.2);

        StudentLessonSix studentTwo = new StudentLessonSix(
                2,
                "Andriy",
                "Osadchuk",
                2021);
        studentTwo.gradeMath = 4.1;
        studentTwo.gradeEconomy = 4.0;
        studentTwo.gradeForeignLanguage = 4.3;

        StudentLessonSix studentThree = new StudentLessonSix();
        studentThree.studentID = 3;
        studentThree.name = "Inna";
        studentThree.surname = "Boyko";
        studentThree.yearOfStudy = 1995;
        studentThree.gradeMath = 3.3;
        studentThree.gradeEconomy = 4.5;
        studentThree.gradeForeignLanguage = 2.5;


        double averageRatingOne = studentOne.averageRating();
        double averageRatingTwo = studentTwo.averageRating();
        double averageRatingThree = studentThree.averageRating();

        System.out.println(
                "Average rating student " + studentOne.name + " " + studentOne.surname + ": " + averageRatingOne);
        System.out.println(
                "Average rating student " + studentTwo.name + " " + studentTwo.surname + ": " + averageRatingTwo);
        System.out.println(
                "Average rating student " + studentThree.name + " " + studentThree.surname + ": " + averageRatingThree);

    }
}
