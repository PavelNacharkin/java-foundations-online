package ru.itsjava.exceptions;

public class Calculator {
    public int divisoin(int num,int divider) {
        try {
            return num/divider;
        } catch (ArithmeticException arithmeticException) {
           throw new CalculatorException("Деление на ноль");
        }

    }
}
