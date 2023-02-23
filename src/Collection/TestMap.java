package Collection;

import java.util.*;


public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		list.add("Abhishek");
		list.add("Abhay");
		list.add("Abhay");
		list.add("Ajay");
		list.add("Deepak");
		list.add("Ajay");

		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for(int i=0;i<list.size();i++)
		{
			if(map.containsKey(list.get(i)))
			{
				map.put(list.get(i), map.get(list.get(i))+1);
			}
			else
			{
				map.put(list.get(i), 1);

			}
				
		}
		
		System.out.println(map);
		

	}

}
