package org.example;

public abstract class Expression implements Component {
    protected Component left;
    protected Component right;
    protected int value;

    public Expression(Component left, Component right) {
        this.left = left;
        this.right = right;
    }

    public void execute() {
        if(left == null || right == null) return;
        left.execute();
        right.execute();
    }

    public int getValue() {return value;}

    protected void setValue(int value) {this.value = value;}
}
