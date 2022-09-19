package Home_work_2.arrays;

import Home_work_2.utils.ArraysUtils;

public class ArraysIteration implements IArraysOperation {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole();
        ArraysIteration arrIt = new ArraysIteration();

        System.out.println("Вывод всех элементов массива:");
        System.out.println();
        arrIt.showAllElements(container);

        System.out.println("Вывод каждого второго элемента массива:");
        System.out.println();
        arrIt.showEverySecondElement(container);

        System.out.println("Вывод всех элементов массива в обратном порядке:");
        System.out.println();
        arrIt.reverseArray(container);
    }

    /**
     * Выводит все элементы массива, используя 4 разные формы циклов
     * @param arr - итерируемый массив
     */
    public void showAllElements (int[] arr) {
        System.out.print("Вход в цикл foreach: ");
        for (int item : arr) {
            System.out.print(item + ", ");
        }

        System.out.print("\b\b\n");

        System.out.print("Вход в цикл for: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.print("\b\b\n");

        System.out.print("Вход у цикл while: ");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + ", ");
            i++;
        }

        System.out.print("\b\b\n");

        System.out.print("Вход в цикл do...while: ");
        int j = 0;
        do {
            System.out.print(arr[j] + ", ");
            j++;
        }while(j < arr.length);

        System.out.print("\b\b\n");
        System.out.println();
    }

    /**
     * Выводит каждый второй элемент массива, используя 3 разные формы циклов
     * @param arr - итерируемый массив
     */
    public void showEverySecondElement (int[] arr) {
        System.out.print("Вход в цикл for: ");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + ", ");
        }

        System.out.print("\b\b\n");

        System.out.print("Вход у цикл while: ");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + ", ");
            i += 2;
        }

        System.out.print("\b\b\n");

        System.out.print("Вход в цикл do...while: ");
        int j = 0;
        do {
            System.out.print(arr[j] + ", ");
            j += 2;
        }while(j < arr.length);

        System.out.print("\b\b\n");
        System.out.println();
    }

    /**
     * Выводит все элементы массива в обратном порядке', используя 3 разные формы циклов
     * @param arr - итерируемый массив
     */
    public void reverseArray(int[] arr){
        System.out.print("Вход в цикл for: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ", ");
        }

        System.out.print("\b\b\n");

        System.out.print("Вход у цикл while: ");
        int i = arr.length - 1;
        while (i >= 0) {
            System.out.print(arr[i] + ", ");
            i--;
        }

        System.out.print("\b\b\n");

        System.out.print("Вход в цикл do...while: ");
        int j = arr.length - 1;
        do {
            System.out.print(arr[j] + ", ");
            j--;
        }while(j >= 0);

        System.out.print("\b\b\n");
        System.out.println();
    }
}
