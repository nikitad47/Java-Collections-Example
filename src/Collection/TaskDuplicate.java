package Collection;

import java.util.*;

public class TaskDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("Nikita");
		list.add("Abhay");
		list.add("Nikki");
		list.add("Abby");
		list.add("Abhay");
		
		Set<String> r=new HashSet<>();
	    for(String name: list) {
			if(r.add(name)==false)
				System.out.println(name + " is duplicate");
		}
	}

}
