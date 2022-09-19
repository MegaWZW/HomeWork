package Home_work_2.sorts;

import Home_work_2.utils.ArraysUtils;
import Home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {

        int[] array1 = new int[]{1,2,3,4,5,6};
        int[] array2 = new int[]{1,1,1,1};
        int[] array3 = new int[]{9,1,5,99,9,9};
        int[] array4 = new int[]{};
        int[] array5 = new int[]{6,5,4,3,2,1};

        String unsortedArray1 = Arrays.toString(array1);
        String unsortedArray2 = Arrays.toString(array2);
        String unsortedArray3 = Arrays.toString(array3);
        String unsortedArray4 = Arrays.toString(array4);
        String unsortedArray5 = Arrays.toString(array5);

        SortsUtils.bubble(array1);
        SortsUtils.shake(array2);
        SortsUtils.bubble(array3);
        SortsUtils.shake(array4);
        SortsUtils.bubble(array5);

        String sortedArray1 = Arrays.toString(array1);
        String sortedArray2 = Arrays.toString(array2);
        String sortedArray3 = Arrays.toString(array3);
        String sortedArray4 = Arrays.toString(array4);
        String sortedArray5 = Arrays.toString(array5);

        System.out.println(unsortedArray1 + " -> " + sortedArray1 + " (bubble)");
        System.out.println(unsortedArray2 + " -> " + sortedArray2 + " (shake)");
        System.out.println(unsortedArray3 + " -> " + sortedArray3 + " (bubble)");
        System.out.println(unsortedArray4 + " -> " + sortedArray4 + " (shake)");
        System.out.println(unsortedArray5 + " -> " + sortedArray5 + " (bubble)");

        System.out.println();

        System.out.println("Get random array:");
        int[] randomArray = ArraysUtils.arrayRandom(50, 100);
        String strUnsortedRandomArray = Arrays.toString(randomArray);
        SortsUtils.shake(randomArray);
        String strSortedRandomArray = Arrays.toString(randomArray);
        System.out.println(strUnsortedRandomArray + " -> " + strSortedRandomArray + " (shake)");

        System.out.println();

        System.out.println("Get array from console:");
        int[] arrayFromConsole = ArraysUtils.arrayFromConsole();
        String strUnsortedArrayFromConsole = Arrays.toString(arrayFromConsole);
        SortsUtils.bubble(arrayFromConsole);
        String strSortedArrayFromConsole = Arrays.toString(arrayFromConsole);
        System.out.println(strUnsortedArrayFromConsole + " -> " + strSortedArrayFromConsole + " (bubble)");
    }
}
