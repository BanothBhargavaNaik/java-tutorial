//An example of Arithmetic Exception(divide by zero)
class ArithExceptionDemo 
{
	int a,b;

	public int div(int a, int b)
	{
		try
		{
		this.a = a;
		this.b = b;
		return (a/b);
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();  //this command displays the complete flow of the point at which there is an error
			System.out.println(e);//this simply prints the type of exception
		}
	return 0;
	}

	public static void main(String[] args) 
	{
		ArithExceptionDemo ae = new ArithExceptionDemo();
		System.out.println(ae.div(10,2));
		//System.out.println(ae.div(20,0));
		System.out.println(ae.div(100,25));
	}
}
