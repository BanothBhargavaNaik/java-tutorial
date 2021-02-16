/* this class provides the body for that methods of interface which are either in baseclass or not */

public class Demo1 extends AbstractDemo5 implements Accounting1
{
	public void methodDummy()
	{
		System.out.println("MethodDummy which has grown interface");
	}

	public void methodM1()
	{
		System.out.println("MethodM1 which has grown interface");
	}

	public static void main(String[] args) 
	{
		Demo1 d = new Demo1();
		System.out.println(d.getCPrice());  //base class method
		System.out.println(d.getSPrice());  //base class method
		d.methodDummy();
		d.methodM1();
	}
}
