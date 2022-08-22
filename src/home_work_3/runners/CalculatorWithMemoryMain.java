package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {

        CalculatorWithOperator calcWithOp = new CalculatorWithOperator();
        CalculatorWithMemory memCalc = new CalculatorWithMemory(calcWithOp);

        memCalc.division(28, 5);
        memCalc.putInMemory();
        memCalc.power(memCalc.getFromMemory(), 2);
        memCalc.putInMemory();
        memCalc.multiplication(15, 7);
        memCalc.putInMemory();
        memCalc.addition(memCalc.getFromMemory(),memCalc.getFromMemory());
        memCalc.putInMemory();
        memCalc.addition(memCalc.getFromMemory(), 4.1);
        memCalc.putInMemory();
        memCalc.module(memCalc.getFromMemory());
        memCalc.putInMemory();

        System.out.println("Result: " + memCalc.getFromMemory());

    }
}
