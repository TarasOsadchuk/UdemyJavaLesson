package LessonTwenty;

import java.util.ArrayList;
import java.util.Collections;

public class LessonTwentyTaskOne {

    public static ArrayList<String> abs(String... str) {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    public ArrayList<String> absTest(String... s) {

        ArrayList<String> aL = new ArrayList<>();

        for (String s1 : s) {
            if (!aL.contains(s1)) {
                aL.add(s1);
            }
        }

        Collections.sort(aL);
        System.out.println(aL);
        return aL;
    }

    public static void main(String[] args) {

        // abs
        System.out.println(abs("C", "D", "A", "D", "A", "D", "T", "B"));

        // absTest
        LessonTwentyTaskOne l20 = new LessonTwentyTaskOne();
        l20.absTest("C", "D", "A", "D", "A", "D", "T", "B");
    }
}
