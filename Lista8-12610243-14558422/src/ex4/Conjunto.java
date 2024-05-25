package ex4;
import java.util.Iterator;

public interface Conjunto<T> extends Iterable<T> {
    void add(T element);
    boolean contains(T element);
    void remove(T element);
}