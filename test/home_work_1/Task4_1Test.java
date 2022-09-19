package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_1Test {

    @Test
    public void isOddTest1(){
        Assertions.assertFalse(Task4_1.isOdd(6));
    }

    @Test
    public void isOddTest2(){
        Assertions.assertFalse(Task4_1.isOdd(0));
    }

    @Test
    public void isOddTest3(){
        Assertions.assertTrue(Task4_1.isOdd(5));
    }

    @Test
    public void isOddTest4(){
        Assertions.assertTrue(Task4_1.isOdd(11));
    }
}
