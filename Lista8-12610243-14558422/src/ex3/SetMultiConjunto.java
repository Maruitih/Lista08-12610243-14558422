package ex3;
import java.util.HashSet;

import java.util.Collection;

public class SetMultiConjunto<T> implements MultiConjunto<T> {
	private Collection<T> elementsSet;
	
	public SetMultiConjunto(){
		Collection<T> elementsSet = new HashSet<>();
		this.elementsSet = elementsSet;
	}
	
	public void add(T element) {
		elementsSet.add(element);
	}
	
	public boolean equals(MultiConjunto<T> m) {
		return elementsSet.equals(m.getColecao());
	}
	
	public void addAll(MultiConjunto<T> m) {
		elementsSet.addAll(m.getColecao());
	}
	
	public Collection<T> getColecao(){
		return elementsSet;
	}
	
	public String toString() {
		return elementsSet.toString();
	}
	
}
