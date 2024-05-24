package ex3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

package ex4;
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayMultiConjuntoAdaptor<T> implements MultiConjunto<T> {
    private ArrayList<T> elementsArray;
    private Iterable<T> Conjunto;


    public ArrayMultiConjuntoAdaptor(Iterable<T> ArrayMultiConjunto){
        elementsArray = new ArrayList<>();
        this.Conjunto = ArrayMultiConjunto;

        for(T element: Conjunto) {
            elementsArray.add(element);
        }
    }

    public void add(T element) {
        elementsArray.add(element);
    }

    public boolean contains(T element) {
        return elementsArray.contains(element);
    }

    public void remove(T element) {
        elementsArray.remove(element);
    }

    public boolean equals(MultiConjunto<T> m) {
        return elementsArray.equals(m.getArray());
    }

    public void addAll(MultiConjunto<T> m) {
        elementsArray.addAll(m.getArray());
    }

    public ArrayList<T> getArray(){
        return elementsArray;
    }

    public String toString() {
        return elementsArray.toString();
    }


}