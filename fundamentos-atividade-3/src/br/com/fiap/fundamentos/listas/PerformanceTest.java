package br.com.fiap.fundamentos.listas;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public interface PerformanceTest<T> {
	
	public long populate(List<T> list, int size);
	
	public long populate(Set<T> set, int size);
	
	public long populate(Map<T, T> map, int size);
	
	public long populate(Stack<T> stack, int size);
	
	public long find(List<T> list, T index);
	
	public long find(Set<T> set, T index);
	
	public long find(Map<T, T> map, T key);
	
	public long find(Stack<T> stack, T item);
	
}



