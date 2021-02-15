/*

throw
-----
To create custom/user defined exception
syntax: throw new Exception();

throws
------
To declare a method throws exception

syntax: 

void method() throws Exception
{
	
}

*/

class Age extends Exception
{
	void accept(int x) throws Exception
	{
		if(x<18)
		{
			throw new Age();
		}
		else
		{
			System.out.println("Age accepted");
		}
	}
}

class ThrowDemo
{
	public static void main(String argtsp[])
	{
		Age a = new Age();
		try
		{
		a.accept(19);
		}
		catch(Exception e)
		{
			System.out.println("Age exception");
		}
	}
	
}