package Collection;

import java.util.*;

public class TestPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(10);
		pq.add(20);
		pq.add(30);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		
	}

}
