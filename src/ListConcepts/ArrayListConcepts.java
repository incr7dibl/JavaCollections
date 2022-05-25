package ListConcepts;

import java.util.*;

public class ArrayListConcepts {

	public static void main(String[] args) {

		ArrayList arr1 = new ArrayList(); // non generic arraylis

		ArrayList<Integer> arr2 = new ArrayList<Integer>(); // generic arraylist

		/**********************
		 * Iterator over generic arraylist of class objects using for loop and Iterator
		 ************/

		Employee e1 = new Employee("Harsh", 25, "SDET");
		Employee e2 = new Employee("Kaku", 22, "DEV");
		Employee e3 = new Employee("Babu", 21, "QA");
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		System.out.println(ar4.indexOf(e2)); // gives the index of object 
		System.out.println("Iterating over arraylists \n");
		for (int i = 0; i < ar4.size(); i++) // Using for loop
		{
			Employee employee = ar4.get(i);
			System.out.println(employee.name + "," + employee.age + "," + employee.department);
		}

		Iterator<Employee> it = ar4.iterator();
		while (it.hasNext()) // Using Iterator
		{
			Employee employee = it.next();
			System.out.println(employee.name + "," + employee.age + "," + employee.department);
		}
		/***************************
		 * Merging arraylists using addAll
		 ****************************************/

		arr2.add(1);
		arr2.add(2);
		arr2.add(3);
		arr2.add(1,999);
		// randomly replace the value
		arr2.set(arr2.indexOf(1), 100); 
		System.out.println(arr2);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		

		arr2.addAll(arr1);
		System.out.println("\n addAll method of arraylist \n");
		for (int i = 0; i < arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}
		/******************** Remove elements of array lists **/
		arr2.removeAll(arr1);
		System.out.println("\n removeall method of arraylist \n");
		for (int i = 0; i < arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}
		/******************** Retain/common elements of array lists **/
		ArrayList<Integer> arr5 = new ArrayList<Integer>(); // generic arraylist
		arr5.add(1);
		arr5.add(2);
		arr5.add(3);
		ArrayList<Integer> arr6 = new ArrayList<Integer>();
		arr6.add(1);
		arr6.add(3);
		arr6.add(4);
		arr5.retainAll(arr6);
		System.out.println("\n retainAll method of arraylist \n");
		for (int i = 0; i < arr5.size(); i++) {
			System.out.println(arr5.get(i));
		}

	}

}
