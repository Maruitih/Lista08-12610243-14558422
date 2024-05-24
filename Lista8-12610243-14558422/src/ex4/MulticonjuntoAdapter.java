package ex4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MulticonjuntoAdapter<T> implements Conjunto<T> {
    private Iterable<T> multiconjunto;
    private Set<T> conjunto;

    public MulticonjuntoAdapter(Iterable<T> multiconjunto) {
        this.multiconjunto = multiconjunto;
        this.conjunto = new HashSet<>();
        for (T element : multiconjunto) {
            conjunto.add(element);
        }
    }
        public void add(T element) {
            conjunto.add(element);
        }

        public boolean contains(T element) {
            return conjunto.contains(element);
        }

        public void remove(T element) {
            conjunto.remove(element);
        }

        public Iterator<T> iterator() {
            return conjunto.iterator();
        }

        public String toString() {
            return conjunto.toString();
        }
    }