package arraylistpgr;
import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating TreeSet and
				//adding elements
				TreeSetDemo<String>ts=new TreeSetDemo<String>();
				ts.add("geeks");
				ts.add("For");
				ts.add("Greeks");
				ts.add("is");
				ts.add("helpful");
				Iterator<String>itr=ts.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}

	}

}
