import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedTests {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({"1,2", "3,4"})
    void ParametrizedAddMethodTest(int param1, int param2){
        assertEquals(param1 + param2, calculator.add(param1, param2));
    }
}
