/* This is your application class which extends the
	adapter class overrides the necessary methods */

public class Demo2 extends AdapterDemo 
{
	//Override those methods which are necessary

	public float getCPrice()
	{
		System.out.println("method for cost price");
		return 100;
	}

	public void methodM1()
	{
		System.out.println("MethodM1 which has grown interface");
	}

	public static void main(String[] args) 
	{
	Demo2 d = new Demo2();
	System.out.println(d.getCPrice());
	d.methodM1();
	}
}
