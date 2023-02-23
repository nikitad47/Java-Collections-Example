package Collection;

import java.util.*;

public class Task {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList();
		arr.add("Yogesh");
		arr.add("Java");
		arr.add("Spring");
		arr.add("Python");
	
		for(String i:arr)
		{
			if(i == "Spring")
			{
				System.out.println(i);
			}
		}

	}

}
