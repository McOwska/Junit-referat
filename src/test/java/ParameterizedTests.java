import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedTests {
    @ParameterizedTest
    @CsvSource({"1,2", "3,4"})
    void ParametrizedAddMethodTest(int param1, int param2){
        Calculator calculator = new Calculator();
        assertEquals(param1 + param2, calculator.add(param1, param2));
    }
}
