package org.example;

public class MultiplyExpression extends Expression {
    public MultiplyExpression(Component left, Component right) {
        super(left, right);
    }

    public void execute() {
        super.execute();
        setValue(left.getValue() * right.getValue());
    }
}
