package ListConcepts;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class HashMapsConecpts {
	public static void main(String[] args) {
		// hashmap is class implements Map interface
		// it contains only unique elements
		// it can have one null key and multiple null values
		// ,maintain no order
		// hashmap is not synchronized / not thread safe
		// Concurrent modification exception/ Fail fast 
		HashMap<Integer, String> firstMap = new HashMap<Integer, String>();
		firstMap.put(1, "Harsh");
		firstMap.put(2, "Shubham");
		firstMap.put(3, "Rahul");
		System.out.println(firstMap.containsKey(1));
		firstMap.remove(2);
		System.out.println(firstMap);

		for (java.util.Map.Entry<Integer, String> m : firstMap.entrySet()) {
			System.out.println("Key : " + m.getKey() + " Value : " + m.getValue());
		}
		Employee e1 = new Employee("Harsh", 25, "SDET");
		Employee e2 = new Employee("Kaku", 22, "DEV");
		Employee e3 = new Employee("Babu", 21, "QA");

		HashMap<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

		employeeMap.put(1, e1);
		employeeMap.put(2, e2);
		employeeMap.put(3, e3);

		for (java.util.Map.Entry<Integer, Employee> employee : employeeMap.entrySet()) {
			Employee e = employee.getValue();
			System.out.println("Employee name: " + e.name + " Age : " + e.age + " Dept : " + e.department);
		}

	}
}
