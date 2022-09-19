package home_work_1;

import java.util.Scanner;

public class MakePhoneNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        boolean flag = false;
        System.out.println("Введите 10 цифр подряд в формате ХХХХХХХХХХ");
        String numbers = console.nextLine();

        while(numbers.length() != 10) {
            System.out.println("Вы ввели не 10 цифр");
            System.out.println("Пожалуйста, повторите ввод!");
            numbers = console.nextLine();
        }

        console.close();

        int[] digits = new int[10];
        for (int i = 0; i < digits.length; i++) {
            if (Character.isDigit(numbers.charAt(i))) {
                digits[i] = Character.getNumericValue(numbers.charAt(i));
            }else {
                flag = true;
                break;
            }
        }

        if(flag) {
            System.out.println("В ведённом Вами номере встречаются не только цифры");
        } else {
            System.out.println("Сгенерированный телефонный номер: " + createPhoneNumber(digits));
        }

    }

    public static String createPhoneNumber (int[] digits) {
        if (digits.length != 10 || !containsValidDigits(digits)){
            return null;
        }
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                digits[0],digits[1],digits[2],digits[3],digits[4],digits[5],digits[6],digits[7],digits[8],digits[9]);
    }

    private static boolean containsValidDigits(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length; i++){
            if (!(arr[i] >= 0 && arr[i] <= 9)){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
