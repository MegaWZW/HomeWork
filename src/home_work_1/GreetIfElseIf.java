package home_work_1;

import java.util.Objects;

public class GreetIfElseIf implements ICommunicationPrinter {

    public String welcom(String name) {

        if(Objects.equals(name, "Вася")) {
            return "Привет!\nЯ тебя так долго ждал";

        } else if (Objects.equals(name, "Анастасия")){
            return "Я тебя так долго ждал";

        } else {
            return "Добрый день, а вы кто?";
        }
    }
}
