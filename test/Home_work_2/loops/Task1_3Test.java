package Home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_3Test {

    @Test
    public void powTest1() {
        Task1_3 t = new Task1_3();
        Assertions.assertEquals(25.0, t.pow(5,2));
    }

    @Test
    public void powTest2() {
        Task1_3 t = new Task1_3();
        Assertions.assertEquals(1.0, t.pow(10,0));
    }

    @Test
    public void powTest3() {
        Task1_3 t = new Task1_3();
        Assertions.assertEquals(0.0, t.pow(0,5));
    }

    @Test
    public void powTest4() {
        Task1_3 t = new Task1_3();
        Assertions.assertEquals(1024.0, t.pow(2,10));
    }
}
