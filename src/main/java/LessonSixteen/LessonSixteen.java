package LessonSixteen;

public class LessonSixteen {

    public void email(String email) {

        if (email.contains("yahoo")) {
            System.out.println("User use - Yahoo");
        } else if (email.contains("gmail")) {
            System.out.println("User use - Gmail");
        } else if (email.contains("mail")) {
            System.out.println("User use - Mail");
        } else {
            System.out.println("Mail is not correct!");
        }
    }

    public void emailTest(String email) {

        int indexOne = email.indexOf('@');
        int indexTwo = email.indexOf(';');

        String yahoo = "yahoo.com",
                gmail = "gmail.com",
                mail = "mail.ru";

        if (yahoo.equals(email.substring(indexOne + 1, indexTwo))) {
            System.out.println("User use - Yahoo");
        } else if (gmail.equals(email.substring(indexOne + 1, indexTwo))) {
            System.out.println("User use - Gmail");
        } else if (mail.equals(email.substring(indexOne + 1, indexTwo))) {
            System.out.println("User use - Mail");
        } else {
            System.out.println("Mail is not correct!");
        }
    }

    public void emailTestTwo(String email) {
        int a, b, c = 0;
        while (c < email.length() - 1) {
            a = email.indexOf('@', c);
            b = email.indexOf('.', c);
            c = email.indexOf(';', c + 1);
            System.out.println(email.substring(a + 1, b));
        }
    }
}

class LessonSixteenTest {

    public static void main(String[] args) {

        LessonSixteen lessonSixteen = new LessonSixteen();
        String emailOne = "ya@yahoo.com;",
                emailTwo = "on@mail.ru;",
                emailThree = "ona@gmail.com;",
                emailTest = "ony@emii.com;";

        lessonSixteen.email(emailOne);
        lessonSixteen.email(emailTwo);
        lessonSixteen.email(emailThree);
        lessonSixteen.email(emailTest);

        lessonSixteen.emailTest(emailOne);
        lessonSixteen.emailTest(emailTwo);
        lessonSixteen.emailTest(emailThree);
        lessonSixteen.emailTest(emailTest);

        lessonSixteen.emailTestTwo(emailOne);
        lessonSixteen.emailTestTwo(emailTwo);
        lessonSixteen.emailTestTwo(emailThree);
        lessonSixteen.emailTestTwo(emailTest);
    }
}
