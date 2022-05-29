package Project;

//function Overloading

public class SimpleCalculator {
	void prnsqr(int i) {
		System.out.println("Square of the integer" + i + "is" +i*i);
	}
	void prnsqr(char c) {
		System.out.println(c + "is a character");
	}
	void prnsqr(float f) {
		System.out.println("Square of the integer" + f + "is" +f*f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalculator obj = new SimpleCalculator();
		obj.prnsqr(5);
		obj.prnsqr('a');
		obj.prnsqr(3);

	}

}
