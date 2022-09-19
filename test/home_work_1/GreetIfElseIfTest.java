package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreetIfElseIfTest {

    @Test
    public void welcomTest1() {
        GreetIfElseIf g = new GreetIfElseIf();
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал", g.welcom("Вася"));
    }

    @Test
    public void welcomTest2() {
        GreetIfElseIf g = new GreetIfElseIf();
        Assertions.assertEquals("Я тебя так долго ждал", g.welcom("Анастасия"));
    }

    @Test
    public void welcomTest3() {
        GreetIfElseIf g = new GreetIfElseIf();
        Assertions.assertEquals("Добрый день, а вы кто?", g.welcom("Игорь"));
    }
}
