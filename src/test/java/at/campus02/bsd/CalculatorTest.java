package at.campus02.bsd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculator();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAdd_ResultKnown() {
        // 5 + 3 = 8
        double result = calc.add(5, 3);

        Assertions.assertEquals(8, result);
    }

    @Test
    public void testAdd_ResultCalculated() {
        double a = 12, b = 5;
        double expectedResult = a + b;

        double result = calc.add(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testMinus_ResultKnown() {
        // 20 - 15 = 5
        double result = calc.minus(20, 15);

        Assertions.assertEquals(5, result);
    }

    @Test
    public void testMinus_ResultCalculated() {
        double a = 43, b = 16;
        double expectedResult = a - b;

        double result = calc.minus(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testDivide_ResultKnown() {
        // 100 / 2 = 50
        double result = calc.divide(100, 2);

        Assertions.assertEquals(50, result);
    }

    @Test
    public void testDivide_ResultCalculated() {
        double a = 75, b = 4;
        double expectedResult = a / b;

        double result = calc.divide(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testDivide_DivideByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calc.divide(15, 0);
        });
    }

    @Test
    public void testMultiply_ResultKnown() {
        // 4 * 5 = 20
        double result = calc.multiply(4, 5);

        Assertions.assertEquals(20, result);
    }

    @Test
    public void testMultiply_ResultCalculated() {
        double a = 12, b = 3;
        double expectedResult = a * b;

        double result = calc.multiply(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testFaculty_3(){
        //3! = 1 * 2 * 3 = 6
        int result = calc.calcFaculty(3);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void testFaculty_4(){
        //4! = 1 * 2 * 3 * 4 = 24
        int result = calc.calcFaculty(4);
        Assertions.assertEquals(24, result);
    }

    @Test
    public void testFaculty_negative5(){
        //-5! = not defined --> should return 0
        int result = calc.calcFaculty(-5);
        Assertions.assertEquals(0, result);
    }
}
