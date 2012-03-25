package com.braxisltd.calculator;

public class Add implements Operator {
    public Value operate(Value left, Value right) {
        return left.add(right);
    }

    @Override
    public String toString() {
        return " PLUS ";
    }
}
