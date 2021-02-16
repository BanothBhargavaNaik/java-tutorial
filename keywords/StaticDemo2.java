//An example of 'static' keyword

class StaticDemo2
{
	static int a = 42;
	static int b = 99;

	static void callme()
	{
	System.out.println("a = " + a);
	}
}

class StaticByName 
{
	public static void main(String args[]) 
	{
	StaticDemo2.callme();
	System.out.println("b = " + StaticDemo2.b);

	}
}