package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2Test {

    @Test
    public void result1Test(){
        Assertions.assertEquals(5, Task2.result1);
    }

    @Test
    public void result2Test(){
        Assertions.assertEquals(0, Task2.result2);
    }

    @Test
    public void result3Test(){
        Assertions.assertEquals(0, Task2.result3);
    }

    @Test
    public void result4Test(){
        Assertions.assertEquals(1, Task2.result4);
    }

    @Test
    public void result5Test(){
        Assertions.assertEquals(0, Task2.result5);
    }

    @Test
    public void result6Test(){
        Assertions.assertEquals(1, Task2.result6);
    }

    @Test
    public void result8Test(){
        Assertions.assertFalse(Task2.result8);
    }

    @Test
    public void result9Test(){
        Assertions.assertFalse(Task2.result9);
    }
}
