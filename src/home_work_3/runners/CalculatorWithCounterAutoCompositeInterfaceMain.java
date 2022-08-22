package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        ICalculator calcWithOper = new CalculatorWithOperator();

        CalculatorWithCounterAutoAgregationInterface calculator = new CalculatorWithCounterAutoAgregationInterface(calcWithOper);

        double result = calculator.calc.module(calculator.calc.addition(calculator.calc.addition(calculator.calc.power(calculator.calc.division(28,5),2),
                calculator.calc.multiplication(15,7)), 4.1));

        System.out.println("Result: " + result);
        System.out.println("Number of operations: " + calculator.getCountOperation());
    }
}
