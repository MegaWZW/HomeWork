package home_work_3.calcs.additional;

public class CalculatorWithCounterAutoComposite {

    public CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();

    public long getCountOperation(){
        return calculator.getCountOperation();
    }
}
