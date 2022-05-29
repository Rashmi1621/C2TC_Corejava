package New1;

import java.util.Scanner;

public class studentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter name of the student");
	        String n = sc.nextLine();
	        System.out.println("Enter the marks of the student");
	        float m = sc.nextFloat();
	        System.out.println("Enter the ID of the student");
	        int o = sc.nextInt();
	        
	        System.out.println("the name of the student is: "+n);
	        System.out.println("the marks of the student is: "+m);
	        System.out.println("the ID of the student is: "+o);

	}

}
