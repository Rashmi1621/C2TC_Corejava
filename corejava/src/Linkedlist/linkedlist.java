package Linkedlist;
import java.util.*;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<Integer>();
		for(int i=1;i<=5;i++)
		{
			ll.add(i);     //Inserting element at a specified index.
		}
		System.out.println(ll);
		
		ll.remove(0);     //Removes an element at specified index(0).
		System.out.println("element in Index '0' is removed "+ll);
		for(int i=0;i<ll.size();i++)
		{
			System.out.println("The element at "+i+" Index is "+ll.get(i));  //Returns elements at the specified position.
			
			
		}
		ll.set(1, 5);  //Replaces an elements at the specified position with the passed element.
		System.out.println(ll);
		System.out.println(	"the element '5' index from first is ="+ll.indexOf(5)); //it returns an element at first occurrence of passed object.
		System.out.println("the element '5' index from last is ="+	ll.lastIndexOf(5)); //it returns an index of last occurrence of passed object
		System.out.println(	ll.listIterator()); //it returns a list iterator over the element of this list. 
		System.out.println(	ll.listIterator(2)); //it returns a list iterator over the element of this list starting from the specified index. 
		System.out.println(	"list the elements from index 0 to 4 "+ll.subList(0, 4));   //returns sub list of this list starting from 'fromIndex' to 'toIndex'
	}



	}


