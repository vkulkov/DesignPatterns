package com.lesson_9.merge.menu;

import com.lesson_9.merge.MenuItem;
import com.lesson_9.merge.iterator.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
