package practice;

import java.util.ArrayList;
import java.util.List;

public class arrayLists {
	
	public static void main(String[] args) {
		List<String> items=new ArrayList<String>();
		items.add(0,"me");
		items.add("you");
		items.add("we");
		items.add("them");
		System.out.println(items);
		items.add(2,"me");
		System.out.println(items);
		
	}

}
