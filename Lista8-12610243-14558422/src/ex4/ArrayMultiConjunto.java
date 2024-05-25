package ex4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayMultiConjunto<T> implements Iterable<T> {
    protected ArrayList<T> elements;

    public ArrayMultiConjunto() {
        elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public void addAll(Collection<? extends T> c) {
        elements.addAll(c);
    }

    public boolean equals(ArrayMultiConjunto<T> other) {
        return elements.equals(other.elements);
    }

    public Iterator<T> iterator() {
        return elements.iterator();
    }

    public String toString() {
        return elements.toString();
    }
}