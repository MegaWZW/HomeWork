package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    /**
     * поле, хранящее информацию о том, сколько раз был использован
     * калькулятор
     */
    private long countOperation = 0;

    /**
     * увеличивает на 1 счётчик
     */
    public void incrementCountOperation() {
        this.countOperation++;
    }

    /**
     * Возвращает количество использований калькулятора
     * @return значение счётчика
     */
    public long getCountOperation(){
        return this.countOperation;
    }
}
