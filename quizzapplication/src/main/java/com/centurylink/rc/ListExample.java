package com.centurylink.rc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExample {

/*Summary
ArrayList: Best for scenarios where you need fast random access to elements and the number of elements is relatively stable. Allows duplicates and maintains insertion order.
LinkedList: Best for scenarios where you need fast insertions and deletions, especially at the beginning and end. Allows duplicates and maintains insertion order.
HashSet: Best for scenarios where you need to store unique elements and the order of elements is not important. Does not allow duplicates and does not maintain insertion order.
*/
	public static void main(String[] args) {
		// ArrayList Example
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		arrayList.add("Apple"); // Duplicates are allowed
		
		System.out.println("ArrayList:");
		for (String fruit : arrayList) {
			System.out.println(fruit);
		}
		
		// Perform some operations on ArrayList
		arrayList.remove("Banana");
		System.out.println("ArrayList after removing 'Banana': " + arrayList);
		System.out.println("ArrayList contains 'Apple': " + arrayList.contains("Apple"));
		System.out.println("Size of ArrayList: " + arrayList.size());
		
		// LinkedList Example
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Dog");
		linkedList.add("Cat");
		linkedList.add("Horse");
		linkedList.add("Dog"); // Duplicates are allowed
		
		System.out.println("\nLinkedList:");
		for (String animal : linkedList) {
			System.out.println(animal);
		}
		
		// Perform some operations on LinkedList
		linkedList.remove("Cat");
		System.out.println("LinkedList after removing 'Cat': " + linkedList);
		System.out.println("LinkedList contains 'Horse': " + linkedList.contains("Horse"));
		System.out.println("Size of LinkedList: " + linkedList.size());
		
		// HashSet Example
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Red");
		hashSet.add("Green");
		hashSet.add("Blue");
		hashSet.add("Red"); // Duplicates are not allowed
		
		System.out.println("\nHashSet:");
		for (String color : hashSet) {
			System.out.println(color);
		}
		
		// Perform some operations on HashSet
		hashSet.remove("Green");
		System.out.println("HashSet after removing 'Green': " + hashSet);
		System.out.println("HashSet contains 'Blue': " + hashSet.contains("Blue"));
		System.out.println("Size of HashSet: " + hashSet.size());
	}
	/*
	
	ArrayList
Characteristics:

Dynamic Array: ArrayList is a resizable array implementation of the List interface.
Allows Duplicates: It allows duplicate elements.
Maintains Insertion Order: Elements are stored in the order they are inserted.
Fast Random Access: Provides fast random access to elements using an index.
Slow Insertions/Deletions: Insertions and deletions (except at the end) are slower because elements need to be shifted.
Use Case:

Use ArrayList when you need fast access to elements using an index and when the number of elements is relatively stable.

LinkedList
Characteristics:

Doubly Linked List: LinkedList is a doubly linked list implementation of the List and Deque interfaces.
Allows Duplicates: It allows duplicate elements.
Maintains Insertion Order: Elements are stored in the order they are inserted.
Fast Insertions/Deletions: Provides fast insertions and deletions, especially at the beginning and end.
Slow Random Access: Accessing elements by index is slower because it requires traversal from the beginning or end.
Use Case:

Use LinkedList when you need fast insertions and deletions and when random access is not a priority.

HashSet
Characteristics:

Hash Table: HashSet is a hash table implementation of the Set interface.
No Duplicates: It does not allow duplicate elements.
No Insertion Order: Elements are not stored in the order they are inserted.
Fast Access: Provides fast access to elements based on their hash codes.
No Indexing: Does not support accessing elements by index.
Use Case:

Use HashSet when you need to store unique elements and when the order of elements is not important.
	 */
}