package com.dsa_questions;

import java.util.*;
import java.util.Map.Entry;

public class Teams_Sorting {

	public static void main(String[] args) {
		
		Map<String,Integer> teams = new HashMap<>();
		
		teams.put("A",20);
		teams.put("C",13);
		teams.put("D",16);
		teams.put("B",20);
		
		Comparator<Map.Entry<String, Integer>> comparing = new Comparator<Map.Entry<String,Integer>>() {
			
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				int valuecompare = o2.getValue().compareTo(o1.getValue());
				
				if(valuecompare == 0) {
					
					return o1.getKey().compareTo(o2.getKey());
					
				}
				
				
				return valuecompare;
			}
		};
		
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(teams.entrySet());
		
		Collections.sort(list,comparing);
		
		Map<String,Integer> sortedMap = new LinkedHashMap<>();
		
		for(Map.Entry<String, Integer> entry : list) {
			
			sortedMap.put(entry.getKey(), entry.getValue());
			
		}
		
		System.out.println(sortedMap);
	}
	
}
