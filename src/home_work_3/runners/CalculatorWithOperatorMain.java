package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {

        CalculatorWithOperator func = new CalculatorWithOperator();
        double result = func.module(func.addition(func.addition(func.power(func.division(28,5),2),
                func.multiplication(15,7)), 4.1));

        System.out.println(result);
    }
}
