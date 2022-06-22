package dqueue;
import java.util.*;

public class D_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> d=new  ArrayDeque<String>();
		d.addFirst("Rashmi");
		d.addLast("Sulalkhe");
		d.add("hi");
		d.add("hello");
		//d.add(null);   //Null is not allowed in Deque 
		
		System.out.println(d);
		System.out.println(d.size());   //Returns the number of elements in this deque.
		System.out.println(	d.peek());      //Returns the head of the queue represented by this deque, or null if this deque is empty
		System.out.println(	d.peekFirst());   //Returns the head of this deque, or null if this deque is empty
		System.out.println(	d.pollLast());   //Returns the tail of this deque, or null if this deque is empty
		System.out.println(d.isEmpty());    //Returns true if this collection contains no elements
		System.out.println(d.remove());     //removes the head of the queue represented by this deque
		System.out.println(d);

	}

}
