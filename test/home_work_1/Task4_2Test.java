package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_2Test {

    @Test
    public void middleNumberTest1(){
        Assertions.assertEquals(45, Task4_2.middleNumber(78, 45, 13));
    }

    @Test
    public void middleNumberTest2(){
        Assertions.assertEquals(-13, Task4_2.middleNumber(-13, 45, -15));
    }

    @Test
    public void middleNumberTest3(){
        Assertions.assertEquals(Integer.MAX_VALUE, Task4_2.middleNumber(10, 15, 15));
    }

    @Test
    public void middleNumberTest4(){
        Assertions.assertEquals(98, Task4_2.middleNumber(98, 99, -5));
    }
}
