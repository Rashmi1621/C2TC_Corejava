package thread;

public class Main_thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread rashmi = Thread.currentThread();
		System.out.println("Current Thread is:"+rashmi);
		System.out.println("Name of Current Thread is "+rashmi.getName());
		
		rashmi.setName("Rashmi Sulakhe");
		rashmi.setPriority(6);
		
		
		System.out.println("After Changing name "+rashmi);
		
		System.out.println(rashmi.getName());


	}

}
