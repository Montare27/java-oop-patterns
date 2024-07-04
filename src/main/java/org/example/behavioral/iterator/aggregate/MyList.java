package org.example.behavioral.iterator.aggregate;

import org.example.behavioral.iterator.iterator.Iterator;
import org.example.behavioral.iterator.iterator.MyListIterator;

import java.util.LinkedList;

public class MyList<T> extends LinkedList<T> implements Aggregate<T> {

    @Override
    public Iterator createIterator() {
        return new MyListIterator<>(this);
    }
}
