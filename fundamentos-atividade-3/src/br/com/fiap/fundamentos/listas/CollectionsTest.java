package br.com.fiap.fundamentos.listas;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class CollectionsTest implements PerformanceTest<Integer>{

	@Override
	public long populate(List<Integer> list, int size) {
		LocalDateTime startedAt = LocalDateTime.now();
		
		for (int i = 0; i < size; i++)
			list.add(i);
		
		LocalDateTime endedAt = LocalDateTime.now();
		
		return ChronoUnit
				.MILLIS
				.between(startedAt, endedAt);		
	}

	@Override
	public long populate(Set<Integer> set, int size) {
		LocalDateTime startedAt = LocalDateTime.now();
		
		for (int i = 0; i < size; i++)
			set.add(i);
		
		LocalDateTime endedAt = LocalDateTime.now();
		
		return ChronoUnit
				.MILLIS
				.between(startedAt, endedAt);
	}

	@Override
	public long populate(Map<Integer, Integer> map, int size) {
		LocalDateTime startedAt = LocalDateTime.now();
		
		for (int i = 0; i < size; i++)
			map.put(i, i);
		
		LocalDateTime endedAt = LocalDateTime.now();
		
		return ChronoUnit
				.MILLIS
				.between(startedAt, endedAt);
	}

	@Override
	public long populate(Stack<Integer> stack, int size) {
		LocalDateTime startedAt = LocalDateTime.now();
		
		for (int i = 0; i < size; i++)
			stack.push(i);
		
		LocalDateTime endedAt = LocalDateTime.now();
		
		return ChronoUnit
				.MILLIS
				.between(startedAt, endedAt);
	}
	
	@Override
	public long find(List<Integer> list, Integer index) {
		LocalDateTime startedAt = LocalDateTime.now();		
		list.get(index);		
		LocalDateTime endedAt = LocalDateTime.now();
		
		return ChronoUnit
				.MILLIS
				.between(startedAt, endedAt);		
	}

	@Override
	public long find(Set<Integer> set, Integer index) {
		LocalDateTime startedAt = LocalDateTime.now();		
		
		for (int item : set)
			if (item == index)
				break;
		
		LocalDateTime endedAt = LocalDateTime.now();
		
		return ChronoUnit
				.MILLIS
				.between(startedAt, endedAt);
	}

	@Override
	public long find(Map<Integer, Integer> map, Integer key) {
		LocalDateTime startedAt = LocalDateTime.now();				
		map.get(key);		
		LocalDateTime endedAt = LocalDateTime.now();
		
		return ChronoUnit
				.MILLIS
				.between(startedAt, endedAt);
	}
	
	@Override
	public long find(Stack<Integer> stack, Integer item) {
		LocalDateTime startedAt = LocalDateTime.now();				
		stack.get(item);		
		LocalDateTime endedAt = LocalDateTime.now();
		
		return ChronoUnit
				.MILLIS
				.between(startedAt, endedAt);
	}




}
