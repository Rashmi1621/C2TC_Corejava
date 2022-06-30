package arraylistpgr;
import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating LinkedHashSet and 
		//adding elements
		LinkedHashSet<String>set= new
				LinkedHashSet<String>();
		set.add("geeks");
		set.add("for");
		set.add("geeks");
		set.add("is");
		set.add("very helpful");
		
		//Traversing elements
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
	}

}
