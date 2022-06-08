package exceptions;

public class MultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("One");
		System.out.println("Two");
		//declare a try catch block.
		try //error handling code starts here.
		{
			System.out.println("Before divide");
			int a=1/0; //Exceptional case(exception has occured);
			System.out.println("After divide");
		}
		catch(ArithmeticException e)
		{
			System.out.println("A number cannot be divided by zero");
			System.out.println("Three");
			System.out.println("Four");
		}


	}

}
