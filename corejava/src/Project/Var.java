package Project;

public class Var {
	static int j = 100;//static variable
	int n = 200;//instance variable
	
	//static method
	static void a() {
		int a =200;
		System.out.println("Print from a");
		//n=100; 
		//a2();
		//System.out.println(Super.j);
		//Reason: We can't call Non static method and variable in the static method
	}
	
    void a2() {
    	System.out.println("Inside a2");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Var v = new Var();
		v.a2();
		Var.a();//We are calling class with static method

	}

}
