package LessonFour;

public class Student {

    int studentID;
    String name;
    String surname;
    int yearOfStudy;
    double gradeMath;
    double gradeEconomy;
    double gradeForeignLanguage;

}

class StudentTest {

    public static void main(String[] args) {

        Student studentOne = new Student();
        Student studentTwo = new Student();
        Student studentThree = new Student();

        studentOne.studentID = 1;
        studentOne.name = "Taras";
        studentOne.surname = "Osadchuk";
        studentOne.yearOfStudy = 2021;
        studentOne.gradeMath = 4.5;
        studentOne.gradeEconomy = 3.8;
        studentOne.gradeForeignLanguage = 4.2;

        studentTwo.studentID = 2;
        studentTwo.name = "Andriy";
        studentTwo.surname = "Osadchuk";
        studentTwo.yearOfStudy = 2021;
        studentTwo.gradeMath = 4.1;
        studentTwo.gradeEconomy = 4.0;
        studentTwo.gradeForeignLanguage = 4.3;

        studentThree.studentID = 3;
        studentThree.name = "Inna";
        studentThree.surname = "Boyko";
        studentThree.yearOfStudy = 1995;
        studentThree.gradeMath = 3.3;
        studentThree.gradeEconomy = 4.5;
        studentThree.gradeForeignLanguage = 2.5;

        double averageRatingOne = (studentOne.gradeMath + studentOne.gradeEconomy + studentOne.gradeForeignLanguage) / 3;
        double averageRatingTwo = (studentTwo.gradeMath + studentTwo.gradeEconomy + studentTwo.gradeForeignLanguage) / 3;
        double averageRatingThree = (studentThree.gradeMath + studentThree.gradeEconomy + studentThree.gradeForeignLanguage) / 3;

        System.out.println("Average rating student " + studentOne.name + " " + studentOne.surname + ": " + averageRatingOne);
        System.out.println("Average rating student " + studentTwo.name + " " + studentTwo.surname + ": " + averageRatingTwo);
        System.out.println("Average rating student " + studentThree.name + " " + studentThree.surname + ": " + averageRatingThree);

    }
}
