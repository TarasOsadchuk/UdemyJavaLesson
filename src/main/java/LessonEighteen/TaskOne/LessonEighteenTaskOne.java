package LessonEighteen.TaskOne;

public class LessonEighteenTaskOne {

    public static int[] sortirovka(int[] array) {

        int a;

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 6, -1};
        sortirovka(arr);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
