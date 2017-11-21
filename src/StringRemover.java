/*
 Jackson Frank
 File: StringRemover.java
 Purpose: To remove from a set of strings strings that have the same length
 */

import java.util.*;

public class StringRemover {

	public static void main(String[] args) {
		
		//creates our string set
		Set<String> set = new HashSet<String>();
		set.add("vivek");
		set.add("jackson");
		set.add("miyoshi");
		set.add("callum");
		set.add("connor");
		set.add("lance");
		set.add("bryce");
		set.add("amy");
		set.add("clayton");
		set.add("nathon");
		set.add("elaine");
		set.add("memesquad");
		set.add("12345");
		set.add("123");
		set.add("234");
		set.add("hi");
		set.add("he");
		set.add("by");
		
		System.out.println("Original set: " + set);
		System.out.println();
		
		//adjusts the string set so the set will only have 1 string of any given length
		removeEvenLength(set);
		
		System.out.println("Edited set: " + set);

	}
	
	public static void removeEvenLength(Set<String> set) {
		
		//an Iterator to iterate through the string set
		Iterator<String> itr = set.iterator();
		
		//list of integers that will keep track of the string lengths encountered when iterating throught the list
		List<Integer> lengths = new ArrayList<Integer>();
		
		int size = set.size();
		
		//loops through for all the elements in the string set
		for(int i = 0; i < size; i++) {
			boolean setInt = true;
			String str = itr.next();
			for(int length : lengths) {
				if(str.length() == length) {
					itr.remove();
					setInt = false;
					break;
				}
			}
			if(setInt) {
				lengths.add(str.length());
			}
		}
	}

}
