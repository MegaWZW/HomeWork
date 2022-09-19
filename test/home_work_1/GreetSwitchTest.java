package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreetSwitchTest {

    @Test
    public void welcomTest1() {
        GreetSwitch g = new GreetSwitch();
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал", g.welcom("Вася"));
    }

    @Test
    public void welcomTest2() {
        GreetSwitch g = new GreetSwitch();
        Assertions.assertEquals("Я тебя так долго ждал", g.welcom("Анастасия"));
    }

    @Test
    public void welcomTest3() {
        GreetSwitch g = new GreetSwitch();
        Assertions.assertEquals("Добрый день, а вы кто?", g.welcom("Игорь"));
    }
}
