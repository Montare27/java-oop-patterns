package org.example.behavioral.iterator.aggregate;

import org.example.behavioral.iterator.iterator.Iterator;

public interface Aggregate<T> {

    Iterator<T> createIterator();
}
