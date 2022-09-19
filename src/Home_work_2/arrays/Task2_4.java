package Home_work_2.arrays;

import Home_work_2.utils.ArraysUtils;

import java.util.Arrays;

public class Task2_4 {
    public static void main(String[] args) {

        int lowBound = 35;
        int highBound = 70;

        //Проверка работы методов

        int[] container = ArraysUtils.arrayRandom(50,100);
        System.out.println("Массив: " + Arrays.toString(container));
        System.out.println("Сумма положительных чётных элементов: " + sumOfEvenPositiveItems(container));
        System.out.println("Маскисмальный элемент массива с чётным индексом равен: " + maxItemWithEvenIndex(container));
        System.out.println("Элементы массива, которые меньше среднего арифметического:\n" +
                Arrays.toString(findItemsLowerThanAverage(container)));
        System.out.println("Два наименьших (минимальных) элемента массива: " +
                Arrays.toString(findTwoMinItems(container)));
        System.out.printf("Массив после удаления элементов, принадлежащий интевалу " +
                "от %d до %d: \n%s\n", lowBound, highBound, Arrays.toString(compressArray(container,lowBound,highBound)));
        System.out.println("Сумма цифр массива: " + sumOfAllDigitsInArray(container));
    }

    /**
     * Находит сумму четных положительных элементов массива
     * @param arr - входной массив
     * @return сумма положительных чётных элементов
     */
    public static int sumOfEvenPositiveItems (int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > 0){
                sum += arr[i];
            }
        }
        return sum;
    }

    /**
     * Находит максимальный элемент из элементов массива с четными индексами
     * @param arr - входной массив
     * @return - возвращает максимальный элемент массива с чётным индексом
     */
    public static int maxItemWithEvenIndex (int[] arr) {
        int maxItem = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i += 2){
            if (arr[i] > maxItem) {
                maxItem = arr[i];
            }
        }
        return maxItem;
    }

    /**
     * Находит элементы массива, которые меньше среднего арифметического
     * @param arr - входной массив
     * @return - возвращает массив элементов, которые меньше среднего арифметического исходного массива
     */
    public static int[] findItemsLowerThanAverage (int[] arr) {
        int count = 0;
        int j = 0;
        int sumOfItems = 0;
        for(int item : arr) {
            sumOfItems += item;
        }

        double average = (double)sumOfItems / arr.length;

        for (int item : arr){
            if (item < average){
                count++;
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < average){
                result[j++] += arr[i];
            }
        }
        return result;
    }


    /**
     * Находит два наименьших (минимальных) элемента массива
     * @param arr - входной массив
     * @return - массив из двух минимальных элементов исходного массива
     */
    public static int[] findTwoMinItems (int[] arr){
        int[] result = new int[2];
        Arrays.sort(arr);
        result[0] = arr[0];
        result[1] = arr[1];
        return result;
    }

    /**
     * Сживает масси, удаляя элементы, принадлежащте интревалу [lowBound, highBound]
     * @param arr - входной массив
     * @param lowBound - нижняя граница интервала
     * @param highBound - верхняя граница интервала
     * @return - новый массив с заменёнными на "0" элементами
     */
    public static int[] compressArray (int[] arr, int lowBound, int highBound){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= lowBound && arr[i] <= highBound){
                result[i] = 0;
            }else {
                result[i] = arr[i];
            }
        }
        return result;
    }

    /**
     * Находит сумму цмфр массива
     * @param arr - входной массив
     * @return - сумма всех цифр массива
     */
    public static int sumOfAllDigitsInArray (int[] arr){
        int sum = 0;
        String strArr = Arrays.toString(arr);
        for (int i = 0; i < strArr.length(); i++){
            if (Character.isDigit(strArr.charAt(i))){
                sum += Character.getNumericValue(strArr.charAt(i));
            }
        }
        return sum;
    }
}
