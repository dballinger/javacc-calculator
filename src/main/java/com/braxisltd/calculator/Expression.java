package com.braxisltd.calculator;

public class Expression {
    
    private final ValueProvider leftOperand;
    private final ValueProvider rightOperand;
    private final Operator operator;

    public Expression(ValueProvider leftOperand, ValueProvider rightOperand, Operator operator) {
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }
    
    public Value evaluate() {
        return operator.operate(leftOperand.value(), rightOperand.value());
    }
}
