package Home_work_2.loops;

import java.util.Arrays;
import java.util.Random;

public class Task1_5 {
    public static void main(String[] args) {

        //Проверка работы методов

        System.out.println(showTheBiggestDigitOfNumber(73845));
        System.out.println(getChanceOfEvenNumbers(100, 1000));
        countEvenAndOddDigitsOfNumber(40010000);
        System.out.println(Arrays.toString(fibonacciSequence(10)));
        System.out.println(Arrays.toString(numbersOverGaps(10,35,5)));
        System.out.println(reverseNumber(987645698456L));
    }

    /**
     * Находит наибольшую цифру натурального числа
     * @param number - число, наибольшую цифру которого, необходимо найти
     * @return - наибольшая цифра числа
     */
    public static int showTheBiggestDigitOfNumber (int number) {
        int biggestDigit = 0;
        String strNumber = Integer.toString(number);
        for (int i = 0; i < strNumber.length(); i++) {
            if (Character.getNumericValue(strNumber.charAt(i)) > biggestDigit) {
                biggestDigit = Character.getNumericValue(strNumber.charAt(i));
            }
        }
        return biggestDigit;
    }

    /**
     * Вычисляет вероятность генерации четных случайных чисел
     * @param bound - верхняя граница диапазона (не включительно), в перделах
     *              которого генерируются случайные числа
     * @param amount - количество сгенерированных случайных чисел
     * @return - доля чётных чисел среди случайно сгенерированных
     */
    public static double getChanceOfEvenNumbers (int bound, int amount) {
        int evenCounter = 0;
        Random rnd = new Random();
        for (int i = 0; i < amount; i++) {
            int randNumber = rnd.nextInt(bound);
            if (randNumber % 2 == 0){
                evenCounter++;
            }
        }
        return (double)evenCounter / amount;
    }

    /**
     * Посчитывает четные и нечетные цифры числа
     * @param number - число, чётные и нечётные цифры которого, необходимо подсчитать
     * Метод распечатывает в консоль результат операции
     */
    public static void countEvenAndOddDigitsOfNumber (int number) {
        int oddCounter = 0;
        int evenCounter = 0;
        String strNumber = Integer.toString(number);
        for (int i = 0; i < strNumber.length(); i++) {
            if (Character.getNumericValue(strNumber.charAt(i)) % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }
        System.out.printf("Число %d содержит %d чётных чисел и %d нечётных цифр\n", number, evenCounter, oddCounter);
    }

    /**
     * Выводит последовательность Фибоначчи
     * @param numbers - количество элементов последовательности Фибоначчи
     * @return - массив, содержащий числа последовательности Фибоначчи
     */
    public static int[] fibonacciSequence (int numbers) {
        int[] fibonacci = new int[numbers];

        if (numbers == 0) {
            return fibonacci;
        }else if (numbers == 1) {
            fibonacci[0] = 1;
            return fibonacci;
        }else if (numbers == 2) {
            fibonacci[0] = 1;
            fibonacci[1] = 2;
            return fibonacci;
        }

        fibonacci[0] = 1;
        fibonacci[1] = 2;

        for(int i = 2; i < numbers; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        return fibonacci;
    }

    /**
     * Выводит ряд чисел в диапазоне с шагом
     * @param min - нижняя граница диапазона
     * @param max - верхняя граница диапазона
     * @param gap - длина шага
     * @return - массив, сожержащий ряд чисел в диапазоне с шагом
     */
    public static int[] numbersOverGaps (int min, int max, int gap) {
        int[] result = new int[(max-min)/gap + 1];

        for (int i = 0; i < result.length; i++) {
            result[i] = min + gap*i;
        }
        return result;
    }

    /**
     * Переворачивает число
     * @param number - число, которое нужнео перевернуть
     * @return - перевёрнутое число
     */
    public static long reverseNumber (long number) {
        String strNumber = Long.toString(number);
        StringBuilder strBuilderReversedNumber = new StringBuilder();
        for (int i = strNumber.length()-1; i >= 0; i--) {
            strBuilderReversedNumber.append(strNumber.charAt(i));
        }
        return Long.parseLong(strBuilderReversedNumber.toString());
    }
}
