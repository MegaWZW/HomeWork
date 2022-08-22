package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long countOperation = 0;

    /**
     * Вычисляет частное от деления двух чисел
     * Переопределяет метод из класса CalculatorWithOperator, добавляя увеличение счётчика
     * использования метода на 1
     * @param a делимое
     * @param b делитель
     * @return возвращает результат деления a на b в виде объекта Double,
     * если происходит деление на ноль, то возвращает null
     */
    @Override
    public Double division (double a, double b) {
        countOperation++;
        return super.division(a,b);
    }

    /**
     * Находит произведение двух чисел
     * Переопределяет метод из класса CalculatorWithOperator, добавляя увеличение счётчика
     * использования метода на 1
     * @param a первое число типа long
     * @param b второе число типа long
     * @return возвращает произведение двух чисел типа long
     */
    @Override
    public double multiplication (double a, double b){
        countOperation++;
        return super.multiplication(a,b);
    }

    /**
     * Выполняет вычитание двух чисел
     * Переопределяет метод из класса CalculatorWithOperator, добавляя увеличение счётчика
     * использования метода на 1
     * @param a число, из которого происходит вычитание
     * @param b число, котрое вычитают
     * @return возвращает результат вычитания двух чисел
     */
    @Override
    public double subtraction (double a, double b){
        countOperation++;
        return super.subtraction(a,b);
    }

    /**
     * Производит сложение двух чисел
     * Переопределяет метод из класса CalculatorWithOperator, добавляя увеличение счётчика
     * использования метода на 1
     * @param a первое число
     * @param b второе число
     * @return сумма двух чисел
     */
    @Override
    public double addition (double a, double b){
        countOperation++;
        return super.addition(a,b);
    }

    /**
     * Возведение первого дробного числа в целую степень второго числа
     * использует билиотеку Math
     * Переопределяет метод из класса CalculatorWithMathExtends, добавляя увеличение счётчика
     * использования метода на 1
     * @param a дробное число, возводимое в степень
     * @param b степень, в которую нужно возвести первое число
     * @return результат возведения первого числа в степень второго
     */
    @Override
    public double power (double a, int b){
        countOperation++;
        return super.power(a,b);
    }

    /**
     * Находит модуль переданного числа
     * использует билиотеку Math
     * Переопределяет метод из класса CalculatorWithMathExtends, добавляя увеличение счётчика
     * использования метода на 1
     * @param a число, модуль которого необходимо найти
     * @return модуль переданного числа
     */
    @Override
    public double module (double a){
        countOperation++;
        return super.module(a);
    }

    /**
     * Находит квадратный корень из числа
     * Переопределяет метод из класса CalculatorWithMathExtends, добавляя увеличение счётчика
     * использования метода на 1
     * @param a число, квадратный корень из которого нужной найти
     * @return результат извлечения корня из числа
     */
    @Override
    public double squareRoot (double a) {
        countOperation++;
        return super.squareRoot(a);
    }

    public long getCountOperation() {
        return this.countOperation;
    }
}
