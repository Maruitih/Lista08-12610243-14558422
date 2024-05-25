package ex4;

import org.junit.Test;
import static org.junit.Assert.*;

public class MulticonjuntoAdapterTest {

    @Test
    public void testAdapter() {
        ArrayMultiConjunto<Integer> arrayMultiConjunto = new ArrayMultiConjunto<>();
        arrayMultiConjunto.add(1);
        arrayMultiConjunto.add(2);
        arrayMultiConjunto.add(2);
        arrayMultiConjunto.add(3);

        MulticonjuntoAdapter<Integer> adapter = new MulticonjuntoAdapter<>(arrayMultiConjunto);

        assertTrue(adapter.contains(1));
        assertTrue(adapter.contains(2));
        assertTrue(adapter.contains(3));

        assertFalse(adapter.contains(4));

        for (Integer element : adapter) {
            System.out.println(element);
        }

        adapter.add(4);
        assertTrue(adapter.contains(4));
        System.out.println(adapter);
    }
}