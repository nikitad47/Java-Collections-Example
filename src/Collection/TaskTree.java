package Collection;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TaskTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> tr = new TreeMap();
		
		tr.put(1, "Jay");
		tr.put(3, "Guru");
		tr.put(5, "Veer");
		tr.put(6, "Swami");
		tr.put(2, "Prem");
		
		for(Entry<Integer, String> entry:tr.entrySet())
		{
			System.out.println("Key:" +entry.getKey() + " | " + "Value:" + entry.getValue());
		}

	}

}
