package com.lesson_8.sort;

public class Duck implements Comparable<Duck> {
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weights " + weight;
    }

    @Override
    public int compareTo(Duck o) {
        return Integer.compare(this.weight, o.weight);
    }
}
