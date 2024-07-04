package org.example;

public class Node implements Component{
    private int value;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public void execute() {}

    @Override
    public int getValue() {return value;}
}
