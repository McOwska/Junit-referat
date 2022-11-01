package pl.edu.agh.kis.pz1.calc;

public class Calculator {
    public int add (int a, int b){
        return a + b;
    }

    public int multiply (int a, int b){
        return a * b;
    }

    public int divide (int a, int b){
        if (b == 0.0) {
            throw new ArithmeticException("Dividing by 0 is not possible");
        }

        return a / b;
    }
}
