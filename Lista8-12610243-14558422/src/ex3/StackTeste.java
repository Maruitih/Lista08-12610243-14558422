package ex3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTeste {

	@Test
	void test() {
		StackMultiConjunto<String> a1 = new StackMultiConjunto<>();
		StackMultiConjunto<String> a2 = new StackMultiConjunto<>();
		
		a1.add("Elemento1");
		a1.add("Elemento2");
		a2.add("Elemento1");
		a2.add("Elemento2");
		
		assertTrue(a1.equals(a2));
		a1.addAll(a2);
		assertEquals(a1.toString(), "[Elemento1, Elemento2, Elemento1, Elemento2]");
	}

}
