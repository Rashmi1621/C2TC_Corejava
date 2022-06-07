package myinterface;
interface myinterface
{
    public void method1();
    public void method2();
    }
class Demo implements myinterface
{
	public void method1()
	{
		System.out.println("implementation of method1");
	}
	public void method2()
	{
		System.out.println("implementation of method2");
	}
	public static void main(String arg[])
	{
		myinterface obj= new Demo();
		obj.method1();
	}
}
