/*
 Jackson Frank
 File: UniqueMaps.java
 Purpose: To return whether or not in a map if 2 keys map to the same value
 */

import java.util.*;

public class UniqueMaps {

	public static void main(String[] args) {
		
		//creates map with subjects keyed to the teachers that teach them
		Map<String, String> map = new HashMap<String, String>();
		map.put("McDowell", "math");
		map.put("Miyoshi", "computer science");
		map.put("Schenck", "english");
		map.put("Mclaughlin", "math");
		
		System.out.println("Map: " + map);
		System.out.println("Unique?: " + isUnique(map));

	}
	
	public static boolean isUnique(Map<String, String> map) {
		
		//will store the values of the map in a set
		Set<String> setMap = new HashSet<String>();
		
		for(String str : map.values()) {
			setMap.add(str);
		}
		
		//the set will eliminate duplicates, which will make its size smaller compared to the size of the map values
		//if there were duplicates in the map values, this means that two keys mapped to the same value
		if(setMap.size() < map.values().size()) {
			return false;
		}
		return true;
	}

}
