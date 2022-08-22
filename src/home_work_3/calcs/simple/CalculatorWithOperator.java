package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    /**
     * Поле для счётчика, отслеживающего количество вызовов методов данного класса
     */
    private long count = 0;
    /**
     * Вычисляет частное от деления двух чисел
     * @param a делимое
     * @param b делитель
     * @return возвращает результат деления a на b в виде объекта Double,
     * если происходит деление на ноль, то возвращает null
     */
    public Double division (double a, double b) {
        count++;
        if (b != 0){
            return a/b;
        } else return null;
    }

    /**
     * Находит произведение двух чисел
     * @param a первое число типа long
     * @param b второе число типа long
     * @return возвращает произведение двух чисел типа long
     */
    public double multiplication (double a, double b){
        count++;
        return a*b;
    }

    /**
     * Выполняет вычитание двух чисел
     * @param a число, из которого происходит вычитание
     * @param b число, котрое вычитают
     * @return возвращает результат вычитания двух чисел
     */
    public double subtraction (double a, double b){
        count++;
        return a-b;
    }

    /**
     * Производит сложение двух чисел
     * @param a первое число
     * @param b второе число
     * @return сумма двух чисел
     */
    public double addition (double a, double b){
        count++;
        return a+b;
    }

    /**
     * Возведение первого дробного числа в целую степень второго числа
     * @param a дробное число, возводимое в степень
     * @param b степень, в которую нужно возвести первое число
     * @return результат возведения первого числа в степень второго
     */
    public double power (double a, int b){
        count++;
        double result = 1D;
        for (int i = 0; i < b; i++){
            result *= a;
        }
        return result;
    }

    /**
     * Находит модуль переданного числа
     * @param a число, модуль которого необходимо найти
     * @return модуль переданного числа
     */
    public double module (double a){
        count++;
        if (a < 0){
            return -a;
        }else {
            return a;
        }
    }

    /**
     * Находит квадратный корень из числа
     * @param a число, квадратный корень из которого нужной найти
     * @return результат извлечения корня из числа
     */
    public double squareRoot (double a){
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
