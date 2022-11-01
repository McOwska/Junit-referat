import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedTests {

    private enum Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6})
    void ParametrizedMultiplyMethodTest(int param){
        assertEquals(param * param, calculator.multiply(param, param));
    }

    @ParameterizedTest
    @CsvSource({"1, 2", "3, 4", "5, 6"})
    void ParametrizedAddMethodTest(int param1, int param2){
        assertEquals(param1 + param2, calculator.add(param1, param2));
    }

    @ParameterizedTest
    @EnumSource(Operation.class)
    void ParametrizedEnumTest(Operation operation){
        System.out.println(operation);
    }





}
