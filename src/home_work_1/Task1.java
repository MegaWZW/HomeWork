package home_work_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите первое число");
        int num1 = console.nextInt();
        System.out.println("Введите второе число");
        int num2 = console.nextInt();
        console.close();

        /*
        побитовый оператор &, пример работы:
        45 -> 0010 1101
        77 -> 0100 1101
           &  0000 1101 -> 13
         */
        int bitwiseAndResult = num1 & num2;

        /*
        побитовый оператор |, пример работы:
        45 -> 0010 1101
        77 -> 0100 1101
           |  0110 1101 -> 109
         */
        int bitwiseOrResult = num1 | num2;

        System.out.println("Результат побитового И для двух чисел: " + bitwiseAndResult);
        System.out.println("Результат побитового ИЛИ для двух чисел: " + bitwiseOrResult);

        /*побитовые операции применимы к целочисленным значениям.
        Таким образом к числу 42.5 побитовые операции не применимы.
         */

    }

    public static int bitwiseAnd (int a, int b){
        return a & b;
    }

    public static int bitwiseOr (int a, int b){
        return a | b;
    }
}
