package generic;

public class GenericMethod {
	public<T> void methodgen(T var1)
	{
		System.out.println("The value passed is of type "+.getSimpleName());
		public static void main(String[] args) {

			GenericMethod ob = new GenericMethod(); 
			ob.<String>methodgen(" is the best");

			//Sometimes we can omit the explicit mention of the type in>> and the compiler can automatically identify the type.

			ob.methodgen("Learning Java");
				ob.methodgen(154);

	 
	}

}
