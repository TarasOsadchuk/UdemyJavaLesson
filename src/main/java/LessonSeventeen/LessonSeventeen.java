package LessonSeventeen;

public class LessonSeventeen {

    public boolean equality(StringBuilder sb1, StringBuilder sb2) {

        String s1 = new String(sb1);
        String s2 = new String(sb2);

        return s1.equals(s2);
    }

    public boolean equalityTest(StringBuilder sb1, StringBuilder sb2) {

        boolean result = true;

        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }

        return result;
    }

    public static void main(String[] args) {

        LessonSeventeen lessonSeventeen = new LessonSeventeen();
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("456");
        StringBuilder sb3 = new StringBuilder("123");

        System.out.println(lessonSeventeen.equality(sb1, sb2));
        System.out.println(lessonSeventeen.equality(sb1, sb3));

        System.out.println(lessonSeventeen.equalityTest(sb1, sb2));
        System.out.println(lessonSeventeen.equalityTest(sb1, sb3));
    }
}
