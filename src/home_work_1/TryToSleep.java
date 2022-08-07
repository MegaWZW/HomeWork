package home_work_1;

import java.util.Scanner;

public class TryToSleep {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Сейчас рабочий день? (true/false)");
        boolean weekday = console.nextBoolean();
        System.out.println("На данный момент у Вас отпуск? (true/false)");
        boolean vacation = console.nextBoolean();
        console.close();

        if (sleepIn(weekday, vacation)) {
            System.out.println("Можете спать дальше");
        } else {
            System.out.println("Пора идти на работу");
        }
    }

    public static boolean sleepIn (boolean weekday, boolean vacation) {
        if (weekday && !vacation) {
            return false;
        } else {
            return true;
        }
    }
}
