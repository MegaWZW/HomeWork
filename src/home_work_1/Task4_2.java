package home_work_1;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите первое число");
        int number1 = console.nextInt();

        System.out.println("Введите второе число");
        int number2 = console.nextInt();

        System.out.println("Введите третье число");
        int number3 = console.nextInt();

        console.close();

        int middleNumber = middleNumber(number1, number2, number3);

        if (middleNumber == Integer.MAX_VALUE) {
            System.out.println("Числа не различаются");
        }else {
            System.out.println("Среднее из введённый Вами чисел: " + middleNumber);
        }

    }

    public static int middleNumber (int num1, int num2, int num3) {
        if ((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2)) {
            return num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1)) {
            return num2;
        } else if ((num3 > num1 && num3 < num2) || (num3 > num2 && num3 < num1)) {
            return num3;
        }else {
            return Integer.MAX_VALUE;
        }
    }
}
