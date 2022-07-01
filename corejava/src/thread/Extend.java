package thread;

public class Extend extends Thread {
	
	public void run()
	{
		System.out.println("thread"+Thread.currentThread()+"started");
		System.out.println("thread with priority  "+Thread.currentThread().getPriority()+"is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Extend t1=new Extend();
		Extend t2=new Extend();
		Extend t3=new Extend();
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		System.out.println("priority of thread "+t1.getName()+"="+t1.getPriority());
		System.out.println("priority of thread "+t2.getName()+"="+t2.getPriority());
		System.out.println("priority of thread "+t3.getName()+"="+t3.getPriority());

	}

}
