package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class GreetIfElse {
    public static void main(String[] args) {
        System.out.println("Представьтесь!");

        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        console.close();

        if (!Objects.equals(name, "Вася")){
            if(!Objects.equals(name, "Анастасия")){
                System.out.println("Добрый день, а вы кто?");
            }else {
                System.out.println("Я тебя так долго ждал");
            }
        }else {
            System.out.println("Привет!");
            System.out.println("Я тебя так догло ждал");
        }
    }
}
