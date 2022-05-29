package Project;

public class Polymorphism {
	void add(int x, int y) {
		System.out.println("Addition 2 no's"+(x+y));
	}
	void add(int x, int y, int z) {
		System.out.println("Addition 3 no's"+(x+y+z));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism ob = new Polymorphism();
		ob.add(5,8);
		ob.add(6,4,2);


	}

}
