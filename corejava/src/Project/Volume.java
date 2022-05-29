package Project;
//Assignment on Function overloading

public class Volume {
	void vol(int s)
	{
		System.out.println("Volume of cube " + s + " is " + s*s*s);
	}
	void vol(int l, int b, int h)
	{
		System.out.println("Volume of cuboid is "+l*b*h );
	}
	void vol(double p, double q, int r)
	{
		System.out.println("Volume of sphere is "+p*q*r*r*r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubVolume v = new Volume();
		Volume v= new Volume();
		v.vol(4);
	    v.vol(5,3,4);
		v.vol(1.33,3.14,4);

	}

}
