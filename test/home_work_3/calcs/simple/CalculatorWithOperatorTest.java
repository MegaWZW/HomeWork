package home_work_3.calcs.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithOperatorTest {

    @Test
    public void additionTest() {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        Assertions.assertEquals(2, calc.addition(1,1));
    }
}
