package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();

        double result = calc.calculator.module(calc.calculator.addition(calc.calculator.addition(
                calc.calculator.power(
                        calc.calculator.division(28,5),2), calc.calculator.multiplication(15,7)), 4.1));

        System.out.println("Result: " + result);
        System.out.println("Operations count: " + calc.getCountOperation());
    }
}
