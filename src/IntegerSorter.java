/*
 Jackson Frank
 File: IntegerSorter.java
 Purpose: To sort a list of integers in ascending order, as well as remove duplicates
 		  from the list
 */

import java.util.*;

public class IntegerSorter {

	public static void main(String[] args) {
		
		//creates our integer list
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(21);
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(10);
		list.add(7);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(10);
		list.add(-3);
		
		System.out.println("Original list: " + list);
		System.out.println();
		
		//the method returns the correct sorted and unduplicated set
		Set<Integer> set = sortAndRemoveDuplicates(list);
		
		System.out.println("Edited list: " + set);

	}
	
	public static Set<Integer> sortAndRemoveDuplicates(List<Integer> list) {
		
		//a sorted tree set will sort the integers as well as remove any duplicates
		SortedSet<Integer> set = new TreeSet<Integer>(list);
		
		
		return set;
	}

}
