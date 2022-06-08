package exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int arr[]=new int[6];
		arr[3]=20/0;
		System.out.println("i am in try block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("A no cannot be divided by zero");
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Accessing array element outside of specified limit");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("i am out of try-catch block");

	}

}
