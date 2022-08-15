package Home_work_2.loops;

public class Task1_1 {
    public static void main(String[] args) {
        long value;

        try {
            value = Long.parseLong(args[0]);
            System.out.println("В качестве аргумента программе передано значение " + value);
            if (value < 0) {
                System.out.println("Зачем Вам факториал из отрицательного числа?");
            } else {
                long factorialReceivedByLoops = factorialByLoop(value);
                long factorialReceivedByRecursion = factorialByRecursion(value);
                if (factorialReceivedByRecursion == 0 || factorialReceivedByRecursion < 0) {
                    System.out.println("Произошло переполнение памяти");
                }else {
                    System.out.printf("Факториал %d вычислен при помощи цикла. Он равен %d\n", value, factorialReceivedByLoops);
                    System.out.printf("Факториал %d вычислен при помощи рекурсии. Он равен %d\n", value, factorialReceivedByLoops);
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("В качестве аргумента программе передано не число");
        }
    }

    /**
     * Метод возвращает значение получаемое при последовательном умножении чисел
     * от 1 до введённого числа, т.е факториал, используя цикл
     * @param value -> исходное число
     * @return -> факториал исходного числа
     */
    private static long factorialByLoop (long value) {
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
    private static long factorialByRecursion (long value) {
        long result = 1L;

        if(value == 1 || value == 0) {
            return result;
        }
        return result * factorialByRecursion(value - 1);
    }

}
