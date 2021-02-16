class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		int a=10, b=0,c=0;
		try
		{
			c = a/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		System.out.println(c);
	}
}
