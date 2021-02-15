class S
{
	static int a = 1;
	static void show()
	{
		System.out.println("a = "+a);
	}
}

class StaticMethod
{
	public static void main(String args[])
	{
		S.show();
		S.a = 100;
		S.show();
	}
}
