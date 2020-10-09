package school.siit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void calculatorTest(){
        int totalSum = 1090;
        int calculatorSum = Calculator.calculate("10 cm + 1 m - 10 mm");
        System.out.println(totalSum);
        System.out.println(calculatorSum);

        assertEquals(totalSum, calculatorSum);
    }

    @Test
    public void calculatorTest2(){
        int totalSum = 1080;
        int calculatorSum = Calculator.calculate("10 cm + 1 m - 10 mm");
        System.out.println(totalSum);
        System.out.println(calculatorSum);

        assertEquals(totalSum, calculatorSum);
    }
}