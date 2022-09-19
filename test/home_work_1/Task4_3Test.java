package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_3Test {

    @Test
    public void isDividedTest1(){
        Assertions.assertFalse(Task4_3.isDivided(7, 8));
    }

    @Test
    public void isDividedTest2(){
        Assertions.assertFalse(Task4_3.isDivided(11, 2));
    }

    @Test
    public void isDividedTest3(){
        Assertions.assertFalse(Task4_3.isDivided(15, 0));
    }

    @Test
    public void isDividedTest4(){
        Assertions.assertTrue(Task4_3.isDivided(100, 20));
    }
}
