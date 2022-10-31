import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @BeforeAll
    static void setUpAllTests() {
        System.out.println("Starting all tests");
    }

    @BeforeEach
    void setUpTest() {
        System.out.println("Starting test");
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
        Calculator calculator = new Calculator();
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
       Calculator calculator = new Calculator();
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
        Calculator calculator = new Calculator();
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
        Calculator calculator = new Calculator();

        double a = 4.0;
        double b = 2.0;

        double result = a / b;

        assertEquals(result, calculator.divide(a, b));
    }

    @Test
    void testDivideFalse() {
        Calculator calculator = new Calculator();

        double a = 4.0;
        double b = 2.0;

        double result = 10.0;

        assertNotEquals(result, calculator.divide(a, b));
    }

    @Test
    void testDivideByZero() {
        Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> calculator.divide(4.0, 0.0));
    }

    @Test
    void testMisc() {
        Calculator calculator = new Calculator();
        Calculator calculator2 = new Calculator();

        assertNotSame(calculator, calculator2);
    }

    @Test
    void testMisc2() {
        Calculator calculator = new Calculator();

        assertNotNull(calculator);
    }

    @Test
    void testMisc3() {
        Calculator calculator = new Calculator();

        assertInstanceOf(Calculator.class, calculator);
    }

    @Test
    void testMisc4() {
        Calculator calculator = new Calculator();

        assertAll(
                () -> assertEquals(0.1 + 0.2, calculator.add(0.1, 0.2)),
                () -> assertEquals(2.0 * 3.0, calculator.multiply(2.0, 3.0)),
                () -> assertEquals(4.0 / 2.0, calculator.divide(4.0, 2.0))
        );
    }

}
