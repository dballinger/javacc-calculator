package com.braxisltd.calculator;

public class Divide implements Operator{
    public Value operate(Value left, Value right) {
        return left.divideBy(right);
    }

    @Override
    public String toString() {
        return " DIVIDE_BY ";
    }
}
