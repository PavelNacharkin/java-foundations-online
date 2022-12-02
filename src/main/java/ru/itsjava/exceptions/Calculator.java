package ru.itsjava.exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Calculator {
    public int divisoin(int num, int divider) {
        try {
            return num / divider;
        } catch (ArithmeticException arithmeticException) {
            throw new CalculatorException("Деление на ноль");
        }
    }
}
