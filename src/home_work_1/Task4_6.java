package home_work_1;

import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {

        int userYear;
        boolean isLeapYear;
        Scanner console = new Scanner (System.in);
        System.out.println("Хотите знать какой год был или будет високосным? (Да/Нет)");
        String answer = console.nextLine();

        //((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        while(answer.compareToIgnoreCase("Да") != 0 && answer.compareToIgnoreCase("Нет") !=0 ) {
            System.out.println("Некорректный ввод");
            System.out.println("Ответьте 'Да' или 'Нет'");
            answer = console.nextLine();
        }

        if (answer.compareToIgnoreCase("Да") == 0) {
            System.out.println("Введите год");
            userYear = console.nextInt();
            if(userYear < 0) {
                System.out.println("Год не должен быть отрицательным числом");
            }else {
                isLeapYear = ((userYear % 4 == 0) && (userYear % 100 != 0) || (userYear % 400 == 0));
                if (isLeapYear) {
                    System.out.println("Год високосный");
                } else {
                    System.out.println("Год не високосный");
                }
            }

        } else {
            System.out.println("Всего хорошего");
        }
        console.close();
    }
}
