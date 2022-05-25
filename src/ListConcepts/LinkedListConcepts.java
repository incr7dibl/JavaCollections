package ListConcepts;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListConcepts {

	public static void main(String[] args) {
		// Linked list is heterogeneous
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Harsh");
		ll.add("Ram");
		ll.add("Lakshman");

		System.out.println(ll);

		ll.addFirst("appasaheb");
		ll.addLast("pooja");
		ll.add(1, "lol"); // inserts the value

		System.out.println(ll);

		ll.set(3, "Aashay"); // replaces the value

		System.out.println(ll);

		ll.remove(3);

		System.out.println(ll);
		// To randomly replace element 
		ll.set(ll.indexOf("Harsh"), "Teju");
		
		System.out.println(ll);

		System.out.println("Iterate using for loop");

		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("Iterate using advanced for loop");

		for (String name : ll) {
			System.out.println(name);
		}

		System.out.println("Iterate using Iterator object");

		Iterator<String> a = ll.iterator();

		while (a.hasNext()) {
			System.out.println(a.next());

		}

		System.out.println("Iterate using while loop");

		int size = ll.size();
		int i = 0;
		while (i < size) {
			System.out.println(ll.get(i));
			i++;
		}
	}

}
