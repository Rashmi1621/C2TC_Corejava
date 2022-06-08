package Project;
//Assignment 2

public class Library {
	int Acc_num;
	String Title;
	String Author;
	
	public void input()
	{
		System.out.println("Acc_num "+1054);	
		}
	
	public void compute() {
		System.out.println("Number Of Days late: " + 3 +" Each day fine Rs:5, TOTAL FINE: " +15 );
	}
	
	public void display()
	{
		System.out.println("Accession Number       Title           Author  ");
		System.out.print("     1054         Java Full Stack     Rashmi ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();
		lib.input();
		lib.compute();
        lib.display();

	}

}
