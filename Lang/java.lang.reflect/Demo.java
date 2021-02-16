public class Demo 
{
	private int x=10;
	public int y = 20;

	Demo()
	{
		System.out.println("Dummy Constructor");
	}

	public Demo(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	private void method1()
	{
		System.out.println("Private Method");
	}

	public int method2()
	{
		return (x+y);
	}

}
