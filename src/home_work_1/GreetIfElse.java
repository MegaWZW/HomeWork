package home_work_1;

import java.util.Objects;

public class GreetIfElse implements ICommunicationPrinter {

    public String welcom(String name) {

        if (!Objects.equals(name, "Вася")) {
            if (!Objects.equals(name, "Анастасия")) {
                return "Добрый день, а вы кто?";
            } else {
                return "Я тебя так долго ждал";
            }
        } else {
            return "Привет!\nЯ тебя так долго ждал";
        }
    }
}
