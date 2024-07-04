package org.example;

public class Main {
    public static void main(String[] args) {
        Component component = new SumExpression(new MultiplyExpression(new Node(2), new Node(3)), new Node(4));
        component.execute();

        System.out.println("Result: " + component.getValue());
    }
}
