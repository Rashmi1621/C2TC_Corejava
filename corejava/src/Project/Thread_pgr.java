package Project;
import java.util.*;

public class Thread_pgr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread obb=Thread.currentThread();
		System.out.println("Current thread is"+" "+obb);
		System.out.println("Name of thread is"+" " +obb.getName());
		obb.setName("Rashmi r s");
		System.out.println("Name after changing is"+" "+obb);
		System.out.println("thread can be used inside main only");


	}

}
