package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

        CalculatorWithCounterClassic operation = new CalculatorWithCounterClassic();

        double resDivision = operation.division(28, 5);
        operation.incrementCountOperation();
        double resPow = operation.power(resDivision, 2);
        operation.incrementCountOperation();
        double reMultiplication = operation.multiplication(15, 7);
        operation.incrementCountOperation();
        double resAddition1 = operation.addition(reMultiplication,resPow);
        operation.incrementCountOperation();
        double resAddition2 = operation.addition(resAddition1, 4.1);
        operation.incrementCountOperation();
        double resModule = operation.module(resAddition2);
        operation.incrementCountOperation();

        System.out.println("Result: " + resModule);
        System.out.println("Operations count: " + operation.getCountOperation());
    }
}
