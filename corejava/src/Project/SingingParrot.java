package Project;
//Example Program for multi lineInheritance
class Bird{
	void fly() {
		System.out.println("I am a Bird");
	}
}

class Parrot extends Bird{
	void whatColorAmI() {
		System.out.println("I am green");
	}
}

public class SingingParrot extends Parrot {
	void whatcanISing() {
		System.out.println("I can sing Opera");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingingParrot obj = new SingingParrot();
		obj.whatColorAmI();
		obj.whatcanISing();

	}

}
