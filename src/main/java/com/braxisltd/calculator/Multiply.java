package com.braxisltd.calculator;

public class Multiply implements Operator{
    public Value operate(Value left, Value right) {
        return left.multiplyBy(right);
    }

    @Override
    public String toString() {
        return " MULTIPLY_BY ";
    }
}
