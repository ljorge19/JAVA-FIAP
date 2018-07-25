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
		
		long arrayListPopulateTime = test.populate(arrayList, SIZE);
		long linkedListPopulateTime = test.populate(linkedList, SIZE);
		String fasterListToPopulate = arrayListPopulateTime < linkedListPopulateTime ? "ArrayList" : "LinkedList";
		
		System.out.println("The ArrayList took " + arrayListPopulateTime + " ms to populate");
		System.out.println("The LinkedList took " + linkedListPopulateTime + " ms to populate");
		System.out.println("The " + fasterListToPopulate + " is faster to populate!\n"); 
		
		long arrayListSearchTime = test.find(arrayList, INDEX);
		long linkedListSearchTime = test.find(linkedList, INDEX);
		String fasterListToSearch = arrayListSearchTime < linkedListSearchTime ? "ArrayList" : "LinkedList";
		
		System.out.println("The ArrayList took " + arrayListSearchTime + " ms to find an item");
		System.out.println("The LinkedList took " + linkedListSearchTime + " ms to find an item");
		System.out.println("The " + fasterListToSearch + " is faster to find an item!\n");
	}
	
	private void testSet() {
		CollectionsTest test = new CollectionsTest();
		
		Stack<Integer> stack = new Stack<>();
		Set<Integer> set = new HashSet<>();
		
		long stackPopulateTime = test.populate(stack, SIZE);
		long hashSetPopulateTime = test.populate(set, SIZE);
		String fasterSetToPopulate = stackPopulateTime < hashSetPopulateTime ? "Stack" : "HashSet";
		
		System.out.println("The Stack took " + stackPopulateTime + " ms to populate");
		System.out.println("The HashSet took " + hashSetPopulateTime + " ms to populate");
		System.out.println("The " + fasterSetToPopulate + " is faster to populate!\n"); 
		
		long stackSearchTime = test.find(stack, INDEX);
		long hashSetSearchTime = test.find(set, INDEX);
		String fasterSetToSearch = stackSearchTime < hashSetSearchTime ? "Stack" : "HashSet";
		
		System.out.println("The Stack took " + stackSearchTime + " ms to find an item");
		System.out.println("The HashSet took " + hashSetSearchTime + " ms to find an item");
		System.out.println("The " + fasterSetToSearch + " is faster to find an item!\n");
	}
	
	private void testMap() {
		CollectionsTest test = new CollectionsTest();
		
		Map<Integer, Integer> hashMap = new HashMap<>();
		Map<Integer, Integer> weakHashMap = new WeakHashMap<>();
		
		long hashMapPopulateTime = test.populate(hashMap, SIZE);
		long weakHashMapPopulateTime = test.populate(weakHashMap, SIZE);
		String fasterMapToPopulate = hashMapPopulateTime < weakHashMapPopulateTime ? "HashMap" : "WeakHashMap";
		
		System.out.println("The HashMap took " + hashMapPopulateTime + " ms to populate");
		System.out.println("The WeakHashMap took " + weakHashMapPopulateTime + " ms to populate");
		System.out.println("The " + fasterMapToPopulate + " is faster to populate!\n"); 
		
		long hashMapSearchTime = test.find(hashMap, INDEX);
		long weakHashMapSearchTime = test.find(weakHashMap, INDEX);
		String fasterMapToSearch = hashMapSearchTime < weakHashMapSearchTime ? "HashMap" : "WeakHashMap";
		
		System.out.println("The HashMap took " + hashMapSearchTime + " ms to find an item");
		System.out.println("The WeakHashMap took " + weakHashMapSearchTime + " ms to find an item");
		System.out.println("The " + fasterMapToSearch + " is faster to find an item!");		
	}
	
}
