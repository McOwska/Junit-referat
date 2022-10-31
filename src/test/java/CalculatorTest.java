import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;
    @BeforeAll
    static void setUpAllTests() {
        System.out.println("Starting all tests");
    }

    @BeforeEach
    void setUpTest() {
        System.out.println("Starting test");
        calculator = new Calculator();
    }

    @AfterEach
    void cleanAfterTest() {
        System.out.println("Test finished");
    }

    @AfterAll
    static void cleanAfterAllTests() {
        System.out.println("All tests finished");
    }


    @Test
    void testAddTrue() {
        // given
        double a = 0.1;
        double b = 0.2;

        // when
        double result = a + b;

        // then
        assertEquals(result, calculator.add(a, b));
    }

    @Test
    void testMultiplyTrue() {
        // given
        double a = 2.0;
        double b = 3.0;

        // when
        double result = 8.0;

        // then
        assertTrue(result > calculator.multiply(a, b));
    }

    @Test
    void testMultiplyFalse() {
        // given
        double a = 4.0;
        double b = 4.0;

        // when
        double result = 300.0;

        // then
        assertFalse(result < calculator.multiply(a, b));
    }

    @Test
    void testDivideTrue() {
        double a = 4.0;
        double b = 2.0;

        double result = a / b;

        assertEquals(result, calculator.divide(a, b));
    }

    @Test
    void testDivideFalse() {

        double a = 4.0;
        double b = 2.0;

        double result = 10.0;

        assertNotEquals(result, calculator.divide(a, b));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(4.0, 0.0));
    }

    @Test
    void testMisc() {
        Calculator calculator2 = new Calculator();

        assertNotSame(calculator, calculator2);
    }

    @Test
    void testMisc2() {

        assertNotNull(calculator);
    }

    @Test
    void testMisc3() {
        assertInstanceOf(Calculator.class, calculator);
    }

    @Test
    void testMisc4() {
        assertAll(
                () -> assertEquals(0.1 + 0.2, calculator.add(0.1, 0.2)),
                () -> assertEquals(2.0 * 3.0, calculator.multiply(2.0, 3.0)),
                () -> assertEquals(4.0 / 2.0, calculator.divide(4.0, 2.0))
        );
    }

}
