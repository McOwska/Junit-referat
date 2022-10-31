import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class RepeatedTests {
    @DisplayName("Repeated multiplication test")
    @RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    void repeatedTest() {
        Calculator calculator = new Calculator();
        double a = 4.0;
        double b = 10.0;

        double result = a * b;

        assertEquals(result, calculator.multiply(a, b));
    }

    @DisplayName("Repeated multiplication test 2")
    @RepeatedTest(5)
    void repeatedTest2(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("Current repetitions:" + repetitionInfo.getCurrentRepetition());

        Calculator calculator = new Calculator();
        double a = 20.0;
        double b = 30.0;

        double result = a * b;

        assertEquals(result, calculator.multiply(a, b));
    }
}
