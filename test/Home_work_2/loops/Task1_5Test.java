package Home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_5Test {

    @Test
    public void showTheBiggestDigitOfNumberTest1() {
        Assertions.assertEquals(8, Task1_5.showTheBiggestDigitOfNumber(75387421));
    }

    @Test
    public void showTheBiggestDigitOfNumberTest2() {
        Assertions.assertEquals(1, Task1_5.showTheBiggestDigitOfNumber(10011));
    }

    @Test
    public void countEvenAndOddDigitsOfNumberTest1() {
        Assertions.assertArrayEquals(new int[]{7,1}, Task1_5.countEvenAndOddDigitsOfNumber(40010000));
    }

    @Test
    public void countEvenAndOddDigitsOfNumberTest2() {
        Assertions.assertArrayEquals(new int[]{0,4}, Task1_5.countEvenAndOddDigitsOfNumber(5555));
    }

    @Test
    public void countEvenAndOddDigitsOfNumberTest3() {
        Assertions.assertArrayEquals(new int[]{1,0}, Task1_5.countEvenAndOddDigitsOfNumber(0));
    }

    @Test
    public void fibonacciSequenceTest1() {
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 5, 8, 13, 21, 34, 55, 89}, Task1_5.fibonacciSequence(10));
    }

    @Test
    public void numbersOverGapsTest1() {
        Assertions.assertArrayEquals(new int[]{10,20,30,40,50,60,70,80,90,100}, Task1_5.numbersOverGaps(10, 100, 10));
    }

    @Test
    public void reverseNumberTest1() {
        Assertions.assertEquals(478231365497889L, Task1_5.reverseNumber(988794563132874L));
    }
}
