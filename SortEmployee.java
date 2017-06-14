package com.corejava.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortEmployee {
	
	public static void main(String args[]){
		
		Map<Integer, String> employee = new HashMap<>();
		List<Integer> values = new ArrayList<>();
		Map<Integer, String> sortedEmployee = new LinkedHashMap<>();
		
		employee.put(55000, "Manasa");
		employee.put(1000, "Mukta");
		employee.put(4000, "Anusha");
		employee.put(3000, "Sowmya");
		employee.put(2000, "Alekya");
		
		System.out.println("Salary Details: ");
		Set<Integer> keys = employee.keySet();
		
		for(int key : keys){
			
			System.out.println(key+" : "+employee.get(key));
			values.add(key);
		}
		
		Comparator<Integer> compare = new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1>o2)
					return 1;
				return -1;
			}
			
			
			
		};
		
		System.out.println();
		System.out.println("Salary Deatils Sorted by Salary:: ");
		
		Collections.sort(values, compare);
		for(int i : values){
			
			String val = employee.get(i);
			sortedEmployee.put(i, val);
			
		}
		
		Set<Integer> sortedKeys = sortedEmployee.keySet();
		
		for(int sortedkey : sortedKeys){
			
			System.out.println(sortedkey+" : "+sortedEmployee.get(sortedkey));
		}

		
	}

}
