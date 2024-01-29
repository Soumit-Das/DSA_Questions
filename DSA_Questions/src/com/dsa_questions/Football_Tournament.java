package com.dsa_questions;

/*
 * I have a map with names of football teams and number of wins and i want to sort them them out according to the number of wins but in some cases the number of wins are same so in that case sort them according to their names solve it.
 */

import java.util.*;
import java.util.Map.Entry;

public class Football_Tournament {

	public static void main(String[] args) {
		
		Map<String, Integer> teams = new HashMap<>();
		
	    teams.put("Liverpool", 19);
	    teams.put("Manchester City", 18);
	    teams.put("Chelsea", 16);
	    teams.put("Baeren FC", 15);
	    teams.put("Manchester United", 15);
	    teams.put("PSG", 24);
	    teams.put("Barcelona", 14);
		
	    Comparator<Map.Entry<String, Integer>> teamComparator = new Comparator<Map.Entry<String,Integer>>() {
			
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				int valuecompare = o1.getValue().compareTo(o2.getValue());
				
				if(valuecompare == 0) {
					
					return o1.getKey().compareTo(o2.getKey());
					
				}
				
				return valuecompare;
			}
		};
	    	
	    List<Map.Entry<String,Integer>> teamlist = new ArrayList<>(teams.entrySet());
	    
	    Collections.sort(teamlist,teamComparator);
	    
	    Map<String, Integer> sortedTeams = new LinkedHashMap<>();
	    
	    for (Map.Entry<String, Integer> entry : teamlist) {
	      sortedTeams.put(entry.getKey(), entry.getValue());
	    }
	    
	    System.out.println(sortedTeams);
	    
	}
	
}
