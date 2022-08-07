package home_work_1;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число");

        int number = console.nextInt();
        console.close();

        if (number % 2 == 0){
            System.out.println("Введённое число чётное");
        }else {
            System.out.println("Введённое число нечётное");
        }
    }
}
