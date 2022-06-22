package New3;

import java.util.Iterator;
import java.util.Stack;


public class Vetors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String>stack = new Stack<String>();
		stack.push("hi");
		stack.push("hello");
		stack.push("gm");
		stack.push("gn");
		//Iterartor for the stack
		Iterator<String>itr=stack.iterator();
	//printing the stack
		while(itr.hasNext()) {
			System.out.println(itr.next()+ "");
		}
		System.out.println();
		stack.pop();
		//iterator for the stack
		itr=stack.iterator();
		//printing the stack
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

	}

}
