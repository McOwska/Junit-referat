package pl.edu.agh.kis.pz1.calc;

import org.junit.jupiter.api.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class RepeatedTests {
    @DisplayName("Repeated multiplication test")
    @RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    void repeatedTest() {
        Calculator calculator = new Calculator();
        Random rand = new Random();
        int a = rand.nextInt(1000);
        int b = rand.nextInt(1000);

        int result = a * b;

        assertEquals(result, calculator.multiply(a, b));
    }

    @DisplayName("Repeated multiplication test 2")
    @RepeatedTest(5)
    void repeatedTest2(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("Current repetitions:" + repetitionInfo.getCurrentRepetition());

        Calculator calculator = new Calculator();
        int a = 20;
        int b = 30;

        int result = 600;

        assertEquals(result, calculator.multiply(a, b));
    }
}
