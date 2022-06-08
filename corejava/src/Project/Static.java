package Project;

public class Static {
	static int a;
	static int b;
	
	//Static Block will be executed first, not the main method

	static {
		a=10;
		b=20;
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		System.out.println("Value of a "+ a);
		System.out.println("Value of b "+ b);


	}

}
