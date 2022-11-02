package pl.edu.agh.kis.pz1.calc;

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
        int a = 1;
        int b = 2;

        // when
        int result = 3;

        // then
        assertEquals(result, calculator.add(a, b));
    }

    @Test
    void testMultiplyTrue() {
        // given
        int a = 2;
        int b = 3;

        // when
        int result = 8;

        // then
        assertTrue(result > calculator.multiply(a, b));
    }

    @Test
    void testMultiplyFalse() {
        // given
        int a = 4;
        int b = 4;

        // when
        int result = 300;

        // then
        assertFalse(result < calculator.multiply(a, b));
    }

    @Test
    void testDivideTrue() {
        int a = 4;
        int b = 2;

        int result = 2;

        assertEquals(result, calculator.divide(a, b));
    }

    @Test
    void testDivideFalse() {

        int a = 4;
        int b = 2;

        int result = 10;

        assertNotEquals(result, calculator.divide(a, b));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(4, 0));
    }

    @Test
    void testMisc() {
        Calculator calculator2 = new Calculator();

        assertNotSame(calculator, calculator2);
        assertSame(calculator, calculator);
    }

    @Test
    void testMisc2() {
        calculator = null;
        assertNull(calculator);

        calculator = new Calculator();
        assertNotNull(calculator);
    }

    @Test
    void testMisc3() {
        assertInstanceOf(Calculator.class, calculator);
    }

    @Test
    void testMisc4() {
        assertAll(
                () -> assertEquals(3, calculator.add(1, 2)),
                () -> assertEquals(6, calculator.multiply(2, 3)),
                () -> assertEquals(2, calculator.divide(4, 2))
        );
    }

}
