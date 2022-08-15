package Home_work_2.loops;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {

        long a = 1L;
        long number;

        System.out.println("Введите число");
        Scanner console = new Scanner(System.in);

        number = console.nextLong();
        console.close();

        if (number == 1 || number == -1 || number == 0) {
            System.out.println("Переполнение никогда не произойдёт");
        } else {
            System.out.println("Умножаем long a = 1 на введённое число до перепонения");
            System.out.print("...\n...\n...\n");

            if (number > 0) {
                while (a <= Long.MAX_VALUE/number) {
                    a *= number;
                    System.out.println(a);
                }
            } else {
                while (a >= Long.MAX_VALUE/number) {
                    a *= number;
                    System.out.println(a);
                }
            }

            System.out.println("Значение до переполнения: " + a);
            System.out.println("Значение после переполнения: " + (a*number));
        }
    }
}
