package org.example.behavioral.iterator.iterator;

public interface Iterator<T> {

    void first();
    void next();
    boolean isDone();
    T currentItem();
}
