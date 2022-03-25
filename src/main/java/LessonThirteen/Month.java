package LessonThirteen;

public class Month {

    void whatAMonth(int month) {

        System.out.println("2015");

        switch (month) {
            case 2:
                System.out.println("28 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            default:
                System.out.println("There is no such month!");
        }

//        switch (month) {
//            case 1:
//                System.out.println("31 days in January");
//                break;
//            case 2:
//                System.out.println("February 28 days");
//                break;
//            case 3:
//                System.out.println("31 days in March");
//                break;
//            case 4:
//                System.out.println("30 days in May");
//                break;
//            case 5:
//                System.out.println("31 days in April");
//                break;
//            case 6:
//                System.out.println("30 days in June");
//                break;
//            case 7:
//                System.out.println("31 days in July");
//                break;
//            case 8:
//                System.out.println("31 days in August");
//                break;
//            case 9:
//                System.out.println("30 days in September");
//                break;
//            case 10:
//                System.out.println("31 days in October");
//                break;
//            case 11:
//                System.out.println("30 days in November");
//                break;
//            case 12:
//                System.out.println("31 days in December");
//                break;
//            default:
//                System.out.println("There is no such month!");
//        }
//          OR
//        switch (month) {
//            case 1 -> System.out.println("31 days in January");
//            case 2 -> System.out.println("February 28 days");
//            case 3 -> System.out.println("31 days in March");
//            case 4 -> System.out.println("30 days in May");
//            case 5 -> System.out.println("31 days in April");
//            case 6 -> System.out.println("30 days in June");
//            case 7 -> System.out.println("31 days in July");
//            case 8 -> System.out.println("31 days in August");
//            case 9 -> System.out.println("30 days in September");
//            case 10 -> System.out.println("31 days in October");
//            case 11 -> System.out.println("30 days in November");
//            case 12 -> System.out.println("31 days in December");
//            default -> System.out.println("There is no such month!");
//        }
    }

    public static void main(String[] args) {

        Month month = new Month();
        month.whatAMonth(11);
    }
}
