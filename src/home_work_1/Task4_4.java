package home_work_1;

import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Что хотите перевести, байты или килобайты? (b/kb)");
        String answer = console.nextLine();

        while(!answer.equals("b") && !answer.equals("kb")){
            System.out.println("Некорректный ввод");
            System.out.println("Повторите ввод");
            answer = console.nextLine();
        }

        if(answer.equals("b")) {
            System.out.println("Введите количество байт");
            int userBites = console.nextInt();
            if(userBites < 0) {
                System.out.println("Количетсво байт не может быть меньше нуля");
            } else {
                double result = userBites / 1024D;
                System.out.printf("%d байт это %.3f килобайт", userBites, result);
            }
        } else if (answer.equals("kb")) {
            System.out.println("Введите количество килобайт");
            int userKiloBites = console.nextInt();
            if(userKiloBites < 0) {
                System.out.println("Количетсво килобайт не может быть меньше нуля");
            }else {
                int result = userKiloBites * 1024;
                System.out.printf("%d килобайт это %d байт", userKiloBites, result);
            }
        }
        console.close();
    }
}
