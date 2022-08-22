package home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    /**
     * Поле для счётчика, отслеживающего количество вызовов методов данного класса
     */
    private long count = 0;
    /**
     * Возведение первого дробного числа в целую степень второго числа
     * использует билиотеку Math
     * @param a дробное число, возводимое в степень
     * @param b степень, в которую нужно возвести первое число
     * @return результат возведения первого числа в степень второго
     */
    @Override
    public double power (double a, int b){
        count++;
        return Math.pow(a,b);
    }

    /**
     * Находит модуль переданного числа
     * использует билиотеку Math
     * @param a число, модуль которого необходимо найти
     * @return модуль переданного числа
     */
    @Override
    public double module (double a){
        count++;
        return Math.abs(a);
    }

    /**
     * Находит квадратный корень из числа
     * @param a число, квадратный корень из которого нужной найти
     * @return результат извлечения корня из числа
     */
    @Override
    public double squareRoot (double a) {
        count++;
        return Math.sqrt(a);
    }

    /**
     * Определяет, сколько раз были вызваны методы данного класса
     * @return количество вызовов методов
     */
    public long getCountOperation(){
        return count;
    }
}
