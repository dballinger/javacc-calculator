package com.braxisltd.calculator;

public class Subtract implements Operator {
    public Value operate(Value left, Value right) {
        return left.minus(right);
    }

    @Override
    public String toString() {
        return " MINUS ";
    }
}
