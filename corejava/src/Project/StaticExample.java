package Project;

public class StaticExample {
	static int a=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample s1 = new StaticExample();
		StaticExample s2 = new StaticExample();
		System.out.println("s1.a value "+s1.a);
		System.out.println("s2.a value "+s2.a);
		
		s1.a = 20;
		System.out.println("s1.a value "+s1.a);
		System.out.println("s2.a value "+s2.a);


	}

}
