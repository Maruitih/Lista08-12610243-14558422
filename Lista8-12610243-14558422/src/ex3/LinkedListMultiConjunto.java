package ex3;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListMultiConjunto<T> implements MultiConjunto<T> {
	private Collection<T> elementsLinked;
	
	public LinkedListMultiConjunto() {
		Collection<T> elementsLinked = new LinkedList<>();
		this.elementsLinked = elementsLinked;
	}
	
	public void add(T element) {
		elementsLinked.add(element);
	}
	
	public boolean equals(MultiConjunto<T> m) {
		return elementsLinked.equals(m.getColecao());
	}
	
	public void addAll(MultiConjunto<T> m) {
		elementsLinked.addAll(m.getColecao());
	}
	
	public Collection<T> getColecao(){
		return elementsLinked;
	}
	
	public String toString() {
		return elementsLinked.toString();
	}
	
}
