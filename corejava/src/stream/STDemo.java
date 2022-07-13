package stream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class STDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>numbers=new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(110);
		numbers.add(120);
		numbers.add(150);
		List<Integer>newList=numbers.stream().filter(n->n>101).collect(Collectors.toList());
		System.out.println(newList);
		
		}

}
