package Collection;

import java.util.*;

public class TaskAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Character,Integer> map1 = new HashMap();
		Map<Character,Integer> map2 = new HashMap();
		
		String a="race";
		String b="care";
	
		for(int i=0;i<a.length();i++)
		{
			if(map1.get(a.charAt(i)) != null)
			{
				map1.put(a.charAt(i), map1.get(a.charAt(i))+1);
			}
			else
			{
				map1.put(a.charAt(i), 1);
			}
		}
		
		for(int i=0;i<a.length();i++)
		{
			if(map2.get(a.charAt(i)) != null)
			{
				map2.put(a.charAt(i), map2.get(a.charAt(i))+1);
			}
			else
			{
				map2.put(a.charAt(i), 1);
			}
		}
		
		System.out.println(map1.equals(map2));

	}

}
