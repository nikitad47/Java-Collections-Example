package Collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class TaskCopyonarraylist extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List l = new ArrayList();  this giver error coz arraylist can't add element during iteration

		List l = new CopyOnWriteArrayList();
		
		l.add(1);
		l.add(2);
		
		Iterator i = l.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
			l.add(3);
		}
		
		System.out.println(l);

	}

}
