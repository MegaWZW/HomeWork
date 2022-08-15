package Home_work_2.arrays;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {

    /**
     * Генерирует массив элементов, запрашивая у пользователя размер массива
     * и элементы
     * @return - возвращает сгенерированный массив
     */
    public static int[] arrayFromConsole() {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int len = console.nextInt();
        int[] arr = new int[len];

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Введите число - элемент массива");
            arr[i] = console.nextInt();
        }
        console.close();

        return arr;
    }

    /**
     * Генерирует массив случайных чисел
     * @param size - размер массива
     * @param maxValueExclusion - указывает, до какого числа генерировать случайные числа
     * @return - возвращает сгенерированный массив случайных чисел
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] arr = new int[size];
        Random rnd = new Random();

        for(int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(maxValueExclusion);
        }

        return arr;
    }
}
