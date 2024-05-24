package ex3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteSet {

	@Test
	void test() {
		SetMultiConjunto<String> a1 = new SetMultiConjunto<>();
		SetMultiConjunto<String> a2 = new SetMultiConjunto<>();
		
		a1.add("Elemento2");
		a1.add("Elemento1");
		a2.add("Elemento2");
		a2.add("Elemento1");
		
		assertTrue(a1.equals(a2));
		a1.addAll(a2);
		assertEquals(a1.toString(), "[Elemento2, Elemento1]");
	}

}
