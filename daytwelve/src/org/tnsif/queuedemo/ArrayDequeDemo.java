package org.tnsif.queuedemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		Deque<String>obj=new ArrayDeque<>();
		obj.add("Dnyaneshwar");
		obj.offerFirst("Bhushan");
		obj.addLast("ruchita");
		System.out.println("Array Deque elements are: "
				+obj);
		//extract the elements from deque
		for(String itr:obj)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
		obj.remove();
		System.out.println("Array Deque elements are: "
				+obj);
		obj.removeFirst();
		System.out.println("Array Deque elements are: "
				+obj);
		obj.removeLast();
		System.out.println("Array Deque elements are: "
				+obj);
	}

}
