import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    void testAddTrue() {
        Calculator calculator1 = new Calculator();
        // given
        double a = 2;
        double b = 3;

        // when
        double result = 5;

        // then
        assertEquals(result, calculator1.add(a, b));
    }


    private Calculator calculator;

    @BeforeEach
    void setUp() {
        Calculator calculator = new Calculator();
    }

    @Test
    void testDivideTrue() {

        double result = calculator.divide(4, 2);
        assertEquals(2, result);
    }

    @Test
    void testDivideFalse() {
        double result = calculator.divide(4, 2);
        assertNotEquals(3, result);
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(4, 0));
    }

}
