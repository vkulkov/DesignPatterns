package com.lesson_7.legacy;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter implements Iterator {
    private Enumeration enumeration;

    public EnumerationAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
}
