package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {

        CalculatorWithMathExtends func = new CalculatorWithMathExtends();

        double result = func.module(func.addition(func.addition(func.power(func.division(28,5),2),
                func.multiplication(15,7)), 4.1));

        System.out.println(result);
    }
}
