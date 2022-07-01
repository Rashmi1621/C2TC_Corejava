package thread;

public class SleepThread implements Runnable{
	public void run()
	{
		System.out.println("good morning");
		try
		{
			Thread.sleep(2000);
			
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie.getMessage());
		}System.out.println("java");
		System.out.println(Thread.currentThread());
	}
	public void m1()
	{
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepThread a=new SleepThread();
		Thread	t=new Thread(a,"child ");
		t.start();
		System.out.println("number of active "+Thread.activeCount());
			a.m1();


	}

}
