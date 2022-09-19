package Home_work_2.loops;

public class Task1_1 {

    /**
     * Метод возвращает значение получаемое при последовательном умножении чисел
     * от 1 до введённого числа, т.е факториал, используя цикл
     * @param value -> исходное число
     * @return -> факториал исходного числа
     */
    public long factorialByLoop (long value) {
        long result = 1L;
        for (long i = 1L; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Метод возвращает значение получаемое при последовательном умножении чисел
     * от 1 до введённого числа, т.е факториал, используя рекурсию
     * @param value исходное число
     * @return факториал исходного числа
     */
    public long factorialByRecursion (long value) {
        long result = 1L;

        if(value == 1 || value == 0) {
            return result;
        }
        return (value * factorialByRecursion(value - 1));
    }

}
