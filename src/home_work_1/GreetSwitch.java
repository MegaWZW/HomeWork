package home_work_1;

import java.util.Scanner;
import java.util.Objects;

public class GreetSwitch {
    public static void main(String[] args) {
        String name;

        System.out.println("Представьтесь!");
        Scanner console = new Scanner(System.in);
        name = console.nextLine();
        console.close();

        switch (name) {
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я тебя так догло ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }



    }
}
