package com.java.collections;
import java.util.*;

public class Needofcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Priority Queue
		PriorityQueue <String> al=new PriorityQueue<String>();  

		al.add("a");  
		al.add("b");  
		al.add("c");  
		al.add("d"); 
		al.add("e"); 
        al.add("f"); 
		System.out.println("head:"+al.element());  
		System.out.println("head:"+al.peek());  
		System.out.println("iterating the queue elements:"); 
        
        Iterator <String> itr= al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		al.remove();  
		al.poll();  
		System.out.println("after removing two elements:");  
		  Iterator <String> itr1= al.iterator();
		  while(itr1.hasNext())
		  {
			  System.out.println(itr1.next());
		  }
	}

}
