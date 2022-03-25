package LessonTwentyNine;

import java.time.*;
import java.time.format.*;

public class LessonTwentyNine {

    static DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    static DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    static void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {

        while (ldt1.isBefore(ldt2)) {
            //1
            System.out.print("Работаем с: " + ldt1.format(f1));
            //2
            ldt1 = ldt1.plus(p);
            System.out.println(" До: " + ldt1.format(f1));
            //3
            System.out.print("Отдыхаем с: " + ldt1.format(f2));
            //4
            ldt1 = ldt1.plus(d);
            System.out.println(" До: " + ldt1.format(f2));
        }
    }

    public static void main(String[] args) {

        LocalDateTime ldt1 = LocalDateTime.of(2016,1,1,9,0,0);
        LocalDateTime ldt2 = LocalDateTime.of(2016,10,31,18,0,0);
        Period p = Period.of(0,1,2);
        Duration d = Duration.ofMinutes(600);

        smena(ldt1,ldt2,p,d);
    }
}
