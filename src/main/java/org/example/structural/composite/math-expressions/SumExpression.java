package org.example;

public class SumExpression extends Expression {
    public SumExpression(Component left, Component right) {
        super(left, right);
    }

    public void execute() {
        super.execute();
        setValue(left.getValue() + right.getValue());
    }
}
