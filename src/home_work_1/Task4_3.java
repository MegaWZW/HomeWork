package home_work_1;

import java.util.Scanner;

public class Task4_3 {

    public static boolean isDivided(int a, int b){

        if (b == 0) return false;
        return a % b == 0;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите делимое");
        int number1 = console.nextInt();

        System.out.println("Введите делитель");
        int number2 = console.nextInt();

        while (number2 == 0) {
            System.out.println("На ноль делить нельзя");
            System.out.println("Повторите ввод");
            number2 = console.nextInt();
        }
        console.close();

        if(number1 % number2 == 0) {
            System.out.println("Число " + number1 + " делится на " + number2 + " без остатка");
        } else {
            System.out.println("Число " + number1 + " не делится на " + number2 + " без остатка");
        }
    }
}
