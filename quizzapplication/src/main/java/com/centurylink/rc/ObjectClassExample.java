package com.centurylink.rc;

public class ObjectClassExample {
	private int id;
	private String name;
	
	public ObjectClassExample(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// Override toString method
	@Override
	public String toString() {
		return "ObjectClassExample{id=" + id + ", name='" + name + "'}";
	}
	
	// Override equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		ObjectClassExample that = (ObjectClassExample) obj;
		return id == that.id && name.equals(that.name);
	}
	
	// Override hashCode method
	@Override
	public int hashCode() {
		int result = Integer.hashCode(id);
		result = 31 * result + name.hashCode();
		return result;
	}
	
	// Implement compareTo method
	public int compareTo(ObjectClassExample other) {
		return Integer.compare(this.id, other.id);
	}
	
	public static void main(String[] args) {
		ObjectClassExample obj1 = new ObjectClassExample(1, "Alice");
		ObjectClassExample obj2 = new ObjectClassExample(2, "Bob");
		ObjectClassExample obj3 = new ObjectClassExample(1, "Alice");
		
		// Demonstrate toString method
		System.out.println("obj1: " + obj1);
		System.out.println("obj2: " + obj2);
		
		// Demonstrate equals method
		System.out.println("obj1 equals obj2: " + obj1.equals(obj2));
		System.out.println("obj1 equals obj3: " + obj1.equals(obj3));
		
		// Demonstrate hashCode method
		System.out.println("obj1 hashCode: " + obj1.hashCode());
		System.out.println("obj2 hashCode: " + obj2.hashCode());
		System.out.println("obj3 hashCode: " + obj3.hashCode());
		
		// Demonstrate compareTo method
		System.out.println("obj1 compareTo obj2: " + obj1.compareTo(obj2));
		System.out.println("obj1 compareTo obj3: " + obj1.compareTo(obj3));
	}
}


/*toString Method:

The toString method returns a string representation of the object. By default, it returns a string that consists of the class name followed by the @ character and the object's hash code in hexadecimal.
In this example, we override the toString method to provide a more meaningful string representation of the ObjectClassExample object.
equals Method:

The equals method compares the current object with another object to check for equality. By default, it uses the == operator, which checks for reference equality.
In this example, we override the equals method to compare the id and name fields of the ObjectClassExample object.

hashCode Method:

The hashCode method returns an integer hash code value for the object. It is used in hashing-based collections like HashMap, HashSet, etc.
In this example, we override the hashCode method to generate a hash code based on the id and name fields.
compareTo Method:

The compareTo method is used to compare the current object with another object to determine their relative order. It is part of the Comparable interface.
In this example, we implement the compareTo method to compare the id fields of the ObjectClassExample object.


Summary:
toString: Provides a string representation of the object.
equals: Compares the current object with another object for equality.
hashCode: Returns a hash code value for the object.
compareTo: Compares the current object with another object to determine their relative order.
By understanding these methods, you can customize the behavior of your objects and make them work correctly with collections and other Java APIs.
*/