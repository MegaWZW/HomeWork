package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoSuper operation = new CalculatorWithCounterAutoSuper();

        double result = operation.module(operation.addition(operation.addition(
                operation.power(operation.division(28,5),2), operation.multiplication(15,7)), 4.1));

        System.out.println("Result: " + result);
        System.out.println("Operations count: " + operation.getCountOperation());
    }
}
