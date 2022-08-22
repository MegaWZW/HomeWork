package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoSuper calcWCAS = new CalculatorWithCounterAutoSuper();

        CalculatorWithCounterAutoAgregation calcWithAutoAgr = new CalculatorWithCounterAutoAgregation(calcWCAS);

        double result = calcWithAutoAgr.calc.module(calcWithAutoAgr.calc.addition(calcWithAutoAgr.calc.addition(
                calcWithAutoAgr.calc.power(
                        calcWithAutoAgr.calc.division(28,5),2), calcWithAutoAgr.calc.multiplication(15,7)), 4.1));

        System.out.println("Result: " + result);

        System.out.println("Operations count: " + calcWithAutoAgr.getCountOperation());
    }
}
