package LessonFive.TaskTwo;

public class StudentLessonFive {

    int studentID;
    String name;
    String surname;
    int yearOfStudy;
    double gradeMath;
    double gradeEconomy;
    double gradeForeignLanguage;

    StudentLessonFive(int studentID,
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

    double averageRating() {
        return (gradeMath + gradeEconomy + gradeForeignLanguage) / 3;
    }
}

class StudentTestLessonFive {

    public static void main(String[] args) {

        StudentLessonFive studentOne = new StudentLessonFive(
                1,
                "Taras",
                "Osadchuk",
                2021,
                4.5,
                3.8,
                4.2);
        StudentLessonFive studentTwo = new StudentLessonFive(
                2,
                "Andriy",
                "Osadchuk",
                2021,
                4.1,
                4.0,
                4.3);
        StudentLessonFive studentThree = new StudentLessonFive(
                3,"Inna",
                "Boyko",
                1995,
                3.3,
                4.5,
                2.5);

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
