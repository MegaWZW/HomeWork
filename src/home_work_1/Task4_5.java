package home_work_1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Введите один символ");
        String userInput = console.nextLine();

        while(userInput.length() > 1) {
            System.out.println("Введите ТОЛЬКО один символ");
            userInput = console.nextLine();
        }
        console.close();

        char userChar = userInput.charAt(0);

        if((userChar >= 65 && userChar <= 90) || (userChar >= 97 && userChar <= 122) ||
                (userChar >= 1040 && userChar <= 1103)) {
            System.out.println("Вы ввели букву");
        } else {
            System.out.println("Вы ввели иной символ");
        }

    }
}
