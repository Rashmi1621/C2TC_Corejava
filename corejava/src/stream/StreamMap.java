package stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>fruits=new ArrayList<String>();
		fruits.add("APPLE");
		fruits.add("BANANA");
		fruits.add("CHERRY");		
		Stream<String>StringStream=Stream.map((value)->{return value.toLowerCase()});
	}
}