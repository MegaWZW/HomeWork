package home_work_1;


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

    public static String letterOrOtherCharacter (char a){
        if((a >= 65 && a <= 90) || (a >= 97 && a <= 122) ||
                (a >= 1040 && a <= 1103)) {
            return "Letter";
        } else {
            return "Other character";
        }
    }
}
