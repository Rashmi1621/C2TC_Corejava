package corejava__package;
abstract class atm
{
	abstract void withdraw();
}

public class Day1_p3 extends atm {
	void withdraw()
	{
		System.out.println("withdrawn successfully");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day1_p3 ob1=new Day1_p3();
		ob1.withdraw();

	}

}
