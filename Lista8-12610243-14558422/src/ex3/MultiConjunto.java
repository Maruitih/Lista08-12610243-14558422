package ex3;

import java.util.Collection;

public interface MultiConjunto<T> {
	void add(T element);
	boolean equals(MultiConjunto<T> m);
	void addAll(MultiConjunto<T> m);
	public Collection<T> getColecao();
}
