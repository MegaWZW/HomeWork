package Home_work_2.arrays;

import java.util.Arrays;

public class ArraysUtilsExample {
    public static void main(String[] args) {

        //пример работы метода arrayFromConsole()
        int[] container = ArraysUtils.arrayFromConsole();
        System.out.println(Arrays.toString(container));

        //пример работы метода arrayRandom(int size, int maxValueExclusion)
        int[] container1 = ArraysUtils.arrayRandom(5,100);
        System.out.println(Arrays.toString(container1));
    }
}
