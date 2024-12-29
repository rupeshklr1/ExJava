package com.centurylink.rc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
	
	public static void main(String[] args) {
		// HashMap Example
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Apple", 10);
		hashMap.put("Banana", 20);
		hashMap.put("Cherry", 30);
		hashMap.put("Apple", 40); // Duplicate keys are allowed, but the value will be updated
		
		System.out.println("HashMap:");
		Set<String>  localSampleKeysForHashMapWeareUsing= hashMap.keySet();
		Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		// Perform some operations on HashMap
		hashMap.remove("Banana");
		System.out.println("HashMap after removing 'Banana': " + hashMap);
		System.out.println("HashMap contains 'Apple': " + hashMap.containsKey("Apple"));
		System.out.println("Size of HashMap: " + hashMap.size());
		
		// TreeMap Example
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("Dog", 1);
		treeMap.put("Cat", 2);
		treeMap.put("Horse", 3);
		treeMap.put("Dog", 4); // Duplicate keys are allowed, but the value will be updated
		
		System.out.println("\nTreeMap:");
		for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		// Perform some operations on TreeMap
		treeMap.remove("Cat");
		System.out.println("TreeMap after removing 'Cat': " + treeMap);
		System.out.println("TreeMap contains 'Horse': " + treeMap.containsKey("Horse"));
		System.out.println("Size of TreeMap: " + treeMap.size());
	}
	/*Summary:
HashMap:

Characteristics:
Implements the Map interface.
Allows null keys and values.
Does not maintain any order.
Provides constant-time performance for basic operations (get and put).
Use Case:
Use HashMap when you need fast access to key-value pairs and order does not matter.
TreeMap:

Characteristics:
Implements the NavigableMap interface.
Does not allow null keys (but allows null values).
Maintains keys in natural order (or a specified comparator).
Provides log(n) time cost for basic operations (get and put).
Use Case:
Use TreeMap when you need sorted key-value pairs.
By understanding these differences, you can choose the appropriate map implementation based on your specific requirements. This example should help your friend understand how to use HashMap and TreeMap in Java, along with some common operations that can be performed on these maps */
	
	
	/*Explanation:
HashMap Example:

Map<String, Integer> hashMap = new HashMap<>();: Creates a HashMap with String keys and Integer values.
hashMap.put("Apple", 10);: Adds key-value pairs to the HashMap.
for (Map.Entry<String, Integer> entry : hashMap.entrySet()) { ... }: Iterates over the HashMap and prints each key-value pair.
Operations:
hashMap.remove("Banana");: Removes the key "Banana" from the HashMap.
hashMap.containsKey("Apple");: Checks if the HashMap contains the key "Apple".
hashMap.size();: Returns the size of the HashMap.
TreeMap Example:

Map<String, Integer> treeMap = new TreeMap<>();: Creates a TreeMap with String keys and Integer values.
treeMap.put("Dog", 1);: Adds key-value pairs to the TreeMap.
for (Map.Entry<String, Integer> entry : treeMap.entrySet()) { ... }: Iterates over the TreeMap and prints each key-value pair.
Operations:
treeMap.remove("Cat");: Removes the key "Cat" from the TreeMap.
treeMap.containsKey("Horse");: Checks if the TreeMap contains the key "Horse".
treeMap.size();: Returns the size of the TreeMap.
*/
}