package com.yogadarma.calculator;

public class Calculator {

    int result;

    public Calculator() {
        this.result = 0;
    }

    public void cancel() {
        this.result = 0;
    }

    @Override
    public String toString() {
        return String.valueOf(result);
    }
}
