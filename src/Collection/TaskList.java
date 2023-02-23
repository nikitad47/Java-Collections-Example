package Collection;

import java.util.*;;

public class TaskList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		list.add("Abby");
		list.add("Nikita");
		
		List<String> list1 = new ArrayList<String>();
		
		list1.add("Abc");
		list1.add("Pqr");
		
		System.out.println(list);
		System.out.println(list1);
		

		System.out.println("\n1.Adding element to 1st Position\n");
		
		list.add(0,"Abhay");
		list1.add(0,"Def");
		
		System.out.println(list);
		System.out.println(list1);
		
		
		
		System.out.println("\n2.Printing sizes\n");
		
		System.out.println("Size of 1st List"+list.size());
		System.out.println("Size of 1st List"+list1.size());
		
		
		
		System.out.println("\n3.Sorting the List\n");
		Collections.sort(list);
		Collections.sort(list1);
		System.out.println(list);
		System.out.println(list1);
		
		
		
		System.out.println("\n4.Comparing the lists\n");
		
		System.out.println(list.equals(list1));
		
		
		
		System.out.println("\n5.join the list\n");
		
		list.addAll(list1);
		System.out.println(list);
		
		
		System.out.println("\n6.Converting List to Array\n");
		
		String[] arr = list.toArray(new String[list.size()]);
		
		System.out.println(arr.toString());
		
		
		System.out.println("\n7.replacing 2nd element\n");
		
		list.set(1, "Tukaram");
		System.out.println(list);
		
		
		System.out.println("\n8.Clear the List\n");
		
		list.clear();
		System.out.println(list);

		
	}

}
