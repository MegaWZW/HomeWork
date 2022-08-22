package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    public ICalculator calc;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator c) {
        this.calc = c;
    }

    public long getCountOperation(){
        return calc.getCountOperation();
    }
}
