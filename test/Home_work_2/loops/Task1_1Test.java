package Home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_1Test {

    @Test
    public void factorialByLoopTest1() {
        Task1_1 t = new Task1_1();
        Assertions.assertEquals(1, t.factorialByLoop(0));
    }

    @Test
    public void factorialByLoopTest2() {
        Task1_1 t = new Task1_1();
        Assertions.assertEquals(120, t.factorialByLoop(5));
    }

    @Test
    public void factorialByLoopTest3() {
        Task1_1 t = new Task1_1();
        Assertions.assertEquals(5040, t.factorialByLoop(7));
    }

    @Test
    public void factorialByRecursionTest1(){
        Task1_1 t = new Task1_1();
        Assertions.assertEquals(1, t.factorialByRecursion(0));
    }

    @Test
    public void factorialByRecursionTest2(){
        Task1_1 t = new Task1_1();
        Assertions.assertEquals(120, t.factorialByRecursion(5));
    }

    @Test
    public void factorialByRecursionTest3(){
        Task1_1 t = new Task1_1();
        Assertions.assertEquals(40320, t.factorialByRecursion(8));
    }
}
