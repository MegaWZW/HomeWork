package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.*;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithMathCopy cwmc = new CalculatorWithMathCopy();
        CalculatorWithOperator cwo = new CalculatorWithOperator();
        CalculatorWithMathExtends cwme = new CalculatorWithMathExtends();

        CalculatorWithCounterAutoChoiceAgregation calcWithCountAutoChAgr1 = new CalculatorWithCounterAutoChoiceAgregation(cwmc);
        CalculatorWithCounterAutoChoiceAgregation calcWithCountAutoChAgr2 = new CalculatorWithCounterAutoChoiceAgregation(cwo);
        CalculatorWithCounterAutoChoiceAgregation calcWithCountAutoChAgr3 = new CalculatorWithCounterAutoChoiceAgregation(cwme);

        double result1 = calcWithCountAutoChAgr1.calcWithMathCopy.module(
                calcWithCountAutoChAgr1.calcWithMathCopy.addition(
                        calcWithCountAutoChAgr1.calcWithMathCopy.addition(
                calcWithCountAutoChAgr1.calcWithMathCopy.power(
                        calcWithCountAutoChAgr1.calcWithMathCopy.division(28,5),2), calcWithCountAutoChAgr1.calcWithMathCopy.multiplication(15,7)), 4.1));

        double result2 = calcWithCountAutoChAgr2.calcWithOp.module(
                calcWithCountAutoChAgr2.calcWithOp.addition(
                        calcWithCountAutoChAgr2.calcWithOp.addition(
                                calcWithCountAutoChAgr2.calcWithOp.power(
                                        calcWithCountAutoChAgr2.calcWithOp.division(28,5),2), calcWithCountAutoChAgr2.calcWithOp.multiplication(15,7)), 4.1));

        double result3 = calcWithCountAutoChAgr3.calcWithMathExt.module(
                calcWithCountAutoChAgr3.calcWithMathExt.addition(
                        calcWithCountAutoChAgr3.calcWithMathExt.addition(
                                calcWithCountAutoChAgr3.calcWithMathExt.power(
                                        calcWithCountAutoChAgr3.calcWithMathExt.division(28,5),2), calcWithCountAutoChAgr3.calcWithMathExt.multiplication(15,7)), 4.1));

        System.out.println("Результат при использовании конструктора, принимающего CalculatorWithOperator: " + result2);
        System.out.println("Сколько операций проведено CalculatorWithOperator:" + calcWithCountAutoChAgr2.getCountOperation());

        System.out.println("Результат при использовании конструктора, принимающего CalculatorWithMathCopy: " + result1);
        System.out.println("Сколько операций проведено CalculatorWithMathCopy:" + calcWithCountAutoChAgr1.getCountOperation());

        System.out.println("Результат при использовании конструктора, принимающего CalculatorWithMathExtends: " + result3);
        System.out.println("Сколько операций проведено CalculatorWithMathExtends:" + calcWithCountAutoChAgr3.getCountOperation());
    }
}
