package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TryToSleepTest {

    @Test
    public void sleepInTest1(){
        Assertions.assertTrue(TryToSleep.sleepIn(true, true));
    }

    @Test
    public void sleepInTest2(){
        Assertions.assertFalse(TryToSleep.sleepIn(true, false));
    }

    @Test
    public void sleepInTest3(){
        Assertions.assertTrue(TryToSleep.sleepIn(false, true));
    }

    @Test
    public void sleepInTest4(){
        Assertions.assertTrue(TryToSleep.sleepIn(false, false));
    }
}
