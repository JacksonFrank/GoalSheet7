/*
 Jackson Frank
 File: ElementRemover.java
 Purpose: To remove a range of elements from a list using using certain parameters
 */

import java.util.*;

public class ElementRemover {
	
	//parameters for the removeInRange method
	static final int STARTING_INDEX = 0;
	static final int EDITING_INDEX = 13;
	static final String ELEMENT = "hello";

	public static void main(String[] args) {
		
		//creates a linked list of strings of different ways to say "hello"
		LinkedList<String> list = new LinkedList<String>();
		list.add("hello");
		list.add("hi");
		list.add("bonjour");
		list.add("hi");
		list.add("hola");
		list.add("bonjour");
		list.add("ciao");
		list.add("hello");
		list.add("salaam");
		list.add("namaste");
		list.add("ciao");
		list.add("hi");
		list.add("hola");
		list.add("ola");
		
		System.out.println("Original list: " + list);
		System.out.println();
		
		//calls the method using arguments of the list, what element to remove, and
		//	in what range to remove it in
		removeInRange(list, ELEMENT, STARTING_INDEX, EDITING_INDEX);
		
		System.out.println("Edited list: " + list);
		

	}
	
	public static void removeInRange(LinkedList<String> list, String eValue, int sIndex, int eIndex) {
		
		//Creates an iterator that will iterate through the list
		Iterator<String> itr = list.iterator();
		
		//error checking for bound parameters
		if(sIndex < 0 || eIndex > list.size() || eIndex < sIndex) {
			System.out.println("Bound parameter error");
			return;
		}
		
		//the for loop iterates for each element in the list, and if the loop index is 
		//	currently within the specified bounds, then the iterator will remove the current
		//	element if it is the one specified to be removed
		for(int i = 0; i < eIndex; i++){
			if(i < sIndex) {
				itr.next();
			}
			else if(sIndex < i) {
				if(itr.next().equals(eValue)) {
					itr.remove();
				}
			}
		}
		
		
	}

}
