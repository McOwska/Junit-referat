import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    // private Calculator calculator;

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
        double a = 2;
        double b = 3;

        // when
        double result = 5;

        // then
        assertEquals(result, calculator.add(a, b));
    }

    @Test
    void testDivideTrue() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(4, 2);
        assertEquals(2, result);
    }

    @Test
    void testDivideFalse() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(4, 2);
        assertNotEquals(3, result);
    }

    @Test
    void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.divide(4, 0));
    }


}
