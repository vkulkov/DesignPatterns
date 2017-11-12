package com.lesson_7.legacy;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter implements Enumeration {
    private Iterator iterator;

    public IteratorAdapter(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
