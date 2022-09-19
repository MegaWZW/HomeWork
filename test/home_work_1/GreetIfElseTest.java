package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreetIfElseTest {

    @Test
    public void welcomTest1() {
        GreetIfElse g = new GreetIfElse();
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал", g.welcom("Вася"));
    }

    @Test
    public void welcomTest2() {
        GreetIfElse g = new GreetIfElse();
        Assertions.assertEquals("Я тебя так долго ждал", g.welcom("Анастасия"));
    }

    @Test
    public void welcomTest3() {
        GreetIfElse g = new GreetIfElse();
        Assertions.assertEquals("Добрый день, а вы кто?", g.welcom("Игорь"));
    }
}
