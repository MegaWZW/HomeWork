package home_work_3.calcs.additional;

public class CalculatorWithCounterAutoAgregation {
    public CalculatorWithCounterAutoSuper calc;

    public CalculatorWithCounterAutoAgregation(CalculatorWithCounterAutoSuper calc){
        this.calc = calc;
    }

    public long getCountOperation(){
        return calc.getCountOperation();
    }
}
