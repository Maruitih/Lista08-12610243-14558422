package ex3;

import java.util.Collection;
import java.util.Stack;

public class StackMultiConjunto<T> implements MultiConjunto<T> {
	private Collection<T> elementsStack;
	
	public StackMultiConjunto() {
		Collection<T> elementsStack = new Stack<>();
		this.elementsStack = elementsStack;
	}
	
	public void add(T element) {
		elementsStack.add(element);
	}
	
	public boolean equals(MultiConjunto<T> m) {
		return elementsStack.equals(m.getColecao());
	}
	
	public void addAll(MultiConjunto<T> m) {
		elementsStack.addAll(m.getColecao());
	}
	
	public Collection<T> getColecao(){
		return elementsStack;
	}
	
	public String toString() {
		return elementsStack.toString();
	}
	
}
