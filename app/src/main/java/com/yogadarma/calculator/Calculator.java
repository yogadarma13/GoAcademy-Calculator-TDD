package com.yogadarma.calculator;

public class Calculator {

    double result;

    public Calculator() {
        this.result = 0.0;
    }

    public void cancel() {
        this.result = 0.0;
    }

    public void add(int number) {
        this.result += number;
    }

    public void subtract(int number) {
        this.result -= number;
    }

    public void multiply(int number) {
        this.result *= number;
    }

    public void divide(int number) {
        if (number == 0) {
            this.result = 0.0;
        } else {
            this.result /= number;
        }
    }

    @Override
    public String toString() {
        return String.format("%.1f", result);
    }
}
