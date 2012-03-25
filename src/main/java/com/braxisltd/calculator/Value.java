package com.braxisltd.calculator;

import java.math.BigDecimal;

public class Value implements ValueProvider {
    private static final int SCALE = 2;
    private final BigDecimal value;

    public Value(String value) {
        this.value = new BigDecimal(value).setScale(SCALE);
    }

    private Value(BigDecimal value) {
        this.value = value.setScale(SCALE);
    }

    public Value add(Value addition) {
        return new Value(value.add(addition.value));
    }

    public Value minus(Value subraction) {
        return new Value(value.subtract(subraction.value));
    }

    public Value multiplyBy(Value multiple) {
        return new Value(value.multiply(multiple.value));
    }

    public Value divideBy(Value divisor) {
        return new Value(value.divide(divisor.value));
    }

    public Value value() {
        return this;
    }

    @Override
    public String toString() {
        return value.toPlainString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Value)) return false;

        Value value1 = (Value) o;

        return !(value != null ? !value.equals(value1.value) : value1.value != null);
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
