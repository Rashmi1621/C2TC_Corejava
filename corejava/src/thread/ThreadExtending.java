package thread;

public class ThreadExtending extends Thread {
	public void run()
	{
		System.out.println("Rashmi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new ThreadExtending();
		t.start();

	}

}
