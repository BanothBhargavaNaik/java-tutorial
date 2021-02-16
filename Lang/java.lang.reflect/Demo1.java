public class Demo1 
{
	private int a;
	public int b,c;

	Demo1(int a)
	{
		System.out.println("a value is: "+a);
	}

	public Demo1(int a, int b,int c)
	{

		this.a = a;
		this.b = b;
		this.c = c;
	}

	private void method1()
	{
		System.out.println("Hai! this is private method");
	}

	public int method2()
	{
		return (a+b+c);
	}

}
