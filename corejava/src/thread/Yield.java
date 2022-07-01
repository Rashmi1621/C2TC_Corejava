package thread;

public class Yield 
implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread());
		Thread.yield();
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yield x = new Yield();
		Thread t1=new Thread (x);
		
		Yield y = new Yield();
		Thread t2=new Thread (y);
		
		t1.start();
		t2.start();


	}

}
