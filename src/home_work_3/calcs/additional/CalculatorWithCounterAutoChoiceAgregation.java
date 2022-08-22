package home_work_3.calcs.additional;

import home_work_3.calcs.simple.*;

public class CalculatorWithCounterAutoChoiceAgregation {
    public CalculatorWithOperator calcWithOp = null;
    public CalculatorWithMathExtends calcWithMathExt = null;
    public CalculatorWithMathCopy calcWithMathCopy = null;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator c){
        this.calcWithOp = c;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends c){
        this.calcWithMathExt = c;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy c){
        this.calcWithMathCopy = c;
    }

    public long getCountOperation() {
        if (calcWithMathCopy == null && calcWithMathExt == null){
            return calcWithOp.getCountOperation();
        }else if (calcWithOp == null && calcWithMathCopy == null) {
            return calcWithMathExt.getCountOperation();
        }

        return calcWithMathCopy.getCountOperation();
    }
}
