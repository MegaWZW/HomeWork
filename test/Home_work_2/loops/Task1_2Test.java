package Home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_2Test {

    @Test
    public void productOfDigitsInNumberTest1() {
        Task1_2 t = new Task1_2();
        Assertions.assertEquals("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080", t.productOfDigitsInNumber("181232375"));
    }

    @Test
    public void productOfDigitsInNumberTest2() {
        Task1_2 t = new Task1_2();
        Assertions.assertEquals("Введено не целое число", t.productOfDigitsInNumber("99.2"));
    }

    @Test
    public void productOfDigitsInNumberTest3() {
        Task1_2 t = new Task1_2();
        Assertions.assertEquals("Введено не число", t.productOfDigitsInNumber("Hello"));
    }

    @Test
    public void productOfDigitsInNumberTest4() {
        Task1_2 t = new Task1_2();
        Assertions.assertEquals("Введено не число", t.productOfDigitsInNumber("Привет"));
    }

    @Test
    public void productOfDigitsInNumberTest5() {
        Task1_2 t = new Task1_2();
        Assertions.assertEquals("5 * 6 * 7 * 9 = 1890", t.productOfDigitsInNumber("5679"));
    }
}
