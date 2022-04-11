package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Example_1 {
	
	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>();
		names.add("Harsh");
		names.add("Aashay");
		
		System.out.println(names.indexOf(names.get(1)));
	}

}
