package xyz;

public class one {
	void m1(){ 
		   System.out.println("m1 method in class One"); 
		 } 
		} 
		public class Two extends One { 
		void m2() { 
		  System.out.println("m2 method in class Two"); 
		 } 
		} 
		public class Test { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two t = (Two) new One(); 
		   t.m1(); 
		   t.m2(); 


	}

}
