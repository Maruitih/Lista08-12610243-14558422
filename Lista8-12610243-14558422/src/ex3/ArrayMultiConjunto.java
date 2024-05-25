package ex3;

import java.util.ArrayList;
import java.util.Collection;


public class ArrayMultiConjunto<T> implements MultiConjunto<T>{
	private Collection<T> elementsArray;
	
	public ArrayMultiConjunto(){
		Collection<T> elementsArray = new ArrayList<>();
		this.elementsArray = elementsArray;
	}
	
	public void add(T element) {
		elementsArray.add(element);
	}
	
	public boolean equals(MultiConjunto<T> m) {
		return elementsArray.equals(m.getColecao());
	}
	
	
	public void addAll(MultiConjunto<T> m) {
		elementsArray.addAll(m.getColecao());
	}
	
	public Collection<T> getColecao(){
		return elementsArray;
	}
	
	public String toString() {
		return elementsArray.toString();
	}

	
}
