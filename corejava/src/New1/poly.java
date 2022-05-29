package New1;

public class poly {
	 void add(int x,int y)
		{
			System.out.println("add 2 no"+(x+y));
		}
		void add(int x,int y,int z)
		{
			System.out.println("add 3 no"+(x+y+z));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		poly ob1=new poly();
		ob1.add(2,3);
		ob1.add(2,3,4);

	}

}
