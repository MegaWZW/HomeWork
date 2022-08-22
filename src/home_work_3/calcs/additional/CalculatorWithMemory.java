package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.api.Memory;

public class CalculatorWithMemory {
    public ICalculator calc;
    private double buffer;
    private Memory[] memoryObj = new Memory[2];
    private int i = 0;


    public CalculatorWithMemory(ICalculator c) {
        this.calc = c;
    }

    public void division (double a, double b){
        buffer = calc.division(a,b);
    }

    public void multiplication (double a, double b){
        buffer = calc.multiplication(a,b);
    }

    public void subtraction (double a, double b){
        buffer = calc.subtraction(a,b);
    }

    public void addition (double a, double b){
        buffer = calc.addition(a,b);
    }

    public void power (double a, int b){
        buffer = calc.power(a,b);
    }

    public void module (double a){
        buffer = calc.module(a);
    }

    public void squareRoot (double a){
        buffer = calc.squareRoot(a);
    }

    public void putInMemory(){
       memoryObj[i] = new Memory();
       memoryObj[i].setMemory(buffer);
       i++;
    }

    public double getFromMemory(){
       double result = 0;
       if (memoryObj[i-1] != null){
           result = memoryObj[i-1].getMemory();
           memoryObj[i-1] = null;
       }
       i--;
       return result;
    }
}
