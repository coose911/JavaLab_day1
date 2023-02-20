import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

//    Calculator calculator;
//
//    @Before
//    public void before(){
//        calculator = new Calculator();
//    }


    @Test
    public void testAdd(){
        assertEquals(2, Calculator.add(1, 1));
    }

    @Test
    public void testSubtract(){
        assertEquals(10, Calculator.subtract(15, 5));
    }

    @Test
    public void testMultiply(){
        assertEquals(15, Calculator.multiply(3, 5));
    }

    @Test
    public void testDivide(){
        assertEquals(2.5, Calculator.divide(5, 2), 0.0);
    }
}
