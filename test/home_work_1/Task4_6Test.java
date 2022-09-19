package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4_6Test {

    @Test
    public void isLeapYearTest1() {
        Assertions.assertTrue(Task4_6.isLeapYear(2020));
    }

    @Test
    public void isLeapYearTest2() {
        Assertions.assertTrue(Task4_6.isLeapYear(2008));
    }

    @Test
    public void isLeapYearTest3() {
        Assertions.assertFalse(Task4_6.isLeapYear(1900));
    }

    @Test
    public void isLeapYearTest4() {
        Assertions.assertFalse(Task4_6.isLeapYear(2005));
    }
}
