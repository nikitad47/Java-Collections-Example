package Collection;

import java.util.*;

public class TaskMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Integer> map = new HashMap();
		
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		
		
		//Iterating the HashMap
		System.out.println("1.Iterating the HashMap\n");
		
		for(Integer i:map.keySet())
		{
			System.out.println(i+ " " + map.get(i));
		}
		
		//Replacing value of given key
		System.out.println("\n2.Replacing value of given key");
		
		map.put(1, 40);
		System.out.println(map);

		
		//Replace value by given value
		System.out.println("\n3.Replace value by given value");
		
		for(Integer i:map.keySet())
		{
			if(map.get(i) == 3) 
			{
				map.put(i, 50);
			}
			
		}
		System.out.println(map);
		
		
		//Removing given entry from map
		System.out.println("\n4.Removing given entry from map");
		map.remove(2);
		System.out.println(map);

		
		//Removing all from map
		System.out.println("\n5.Removing all from map");
		map.clear();
		System.out.println(map);

	}

}
