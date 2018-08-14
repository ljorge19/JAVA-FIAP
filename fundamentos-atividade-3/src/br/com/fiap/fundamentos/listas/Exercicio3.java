package br.com.fiap.fundamentos.listas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.WeakHashMap;

public class Exercicio3 {

	private final int SIZE = 1000000;
	private final int INDEX = 500000; 
	
	public static void main(String [] args) {
		Exercicio3 exercicio = new Exercicio3();
		exercicio.testList();
		exercicio.testSet();
		exercicio.testMap();
	}
	
	private void testList() {
		CollectionsTest test = new CollectionsTest();
		
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		long arrayListpopularTime = test.populate(arrayList, SIZE);
		long linkedListpopularTime = test.populate(linkedList, SIZE);
		String fasterListparapopular = arrayListpopularTime < linkedListpopularTime ? "ArrayList" : "LinkedList";
		
		System.out.println("O ArrayList levou " + arrayListpopularTime + " ms para popular");
		System.out.println("O LinkedList levou " + linkedListpopularTime + " ms para popular");
		System.out.println("O " + fasterListparapopular + "  é mais rapido para popular!\n"); 
		
		long arrayListSearchTime = test.find(arrayList, INDEX);
		long linkedListSearchTime = test.find(linkedList, INDEX);
		String fasterListparaSearch = arrayListSearchTime < linkedListSearchTime ? "ArrayList" : "LinkedList";
		
		System.out.println("O ArrayList levou " + arrayListSearchTime + " ms para encontrar um item");
		System.out.println("O LinkedList levou " + linkedListSearchTime + " ms para encontrar um item");
		System.out.println("O " + fasterListparaSearch + "  é mais rapido para encontrar um item!\n");
	}
	
	private void testSet() {
		CollectionsTest test = new CollectionsTest();
		
		Stack<Integer> stack = new Stack<>();
		Set<Integer> set = new HashSet<>();
		
		long stackpopularTime = test.populate(stack, SIZE);
		long hashSetpopularTime = test.populate(set, SIZE);
		String fasterSetparapopular = stackpopularTime < hashSetpopularTime ? "Stack" : "HashSet";
		
		System.out.println("O Stack levou " + stackpopularTime + " ms para popular");
		System.out.println("O HashSet levou " + hashSetpopularTime + " ms para popular");
		System.out.println("O " + fasterSetparapopular + "  é mais rapido para popular!\n"); 
		
		long stackSearchTime = test.find(stack, INDEX);
		long hashSetSearchTime = test.find(set, INDEX);
		String fasterSetparaSearch = stackSearchTime < hashSetSearchTime ? "Stack" : "HashSet";
		
		System.out.println("O Stack levou " + stackSearchTime + " ms para encontrar um item");
		System.out.println("O HashSet levou " + hashSetSearchTime + " ms para encontrar um item");
		System.out.println("O " + fasterSetparaSearch + "  é mais rapido para encontrar um item!\n");
	}
	
	private void testMap() {
		CollectionsTest test = new CollectionsTest();
		
		Map<Integer, Integer> hashMap = new HashMap<>();
		Map<Integer, Integer> weakHashMap = new WeakHashMap<>();
		
		long hashMappopularTime = test.populate(hashMap, SIZE);
		long weakHashMappopularTime = test.populate(weakHashMap, SIZE);
		String fasterMapparapopular = hashMappopularTime < weakHashMappopularTime ? "HashMap" : "WeakHashMap";
		
		System.out.println("O HashMap levou " + hashMappopularTime + " ms para popular");
		System.out.println("O WeakHashMap levou " + weakHashMappopularTime + " ms para popular");
		System.out.println("O " + fasterMapparapopular + "  é mais rapido para popular!\n"); 
		
		long hashMapSearchTime = test.find(hashMap, INDEX);
		long weakHashMapSearchTime = test.find(weakHashMap, INDEX);
		String fasterMapparaSearch = hashMapSearchTime < weakHashMapSearchTime ? "HashMap" : "WeakHashMap";
		
		System.out.println("O HashMap levou " + hashMapSearchTime + " ms para encontrar um item");
		System.out.println("O WeakHashMap levou " + weakHashMapSearchTime + " ms para encontrar um item");
		System.out.println("O " + fasterMapparaSearch + " é mais rapido para encontrar um item!");		
	}
	
}
