/*

finally
-------
This block is executed regradless of whatever happens in try catch

try
{

}
catch()
{

}
finally
{

}

*/



class FinallyDemo
{
	public static void main(String args[])
	{
		int a,b=0;
	
		try
		{
           a=5/b;
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
		
		finally
		{
			System.out.println("Inside finally");
		}

		System.out.println("After exception");
	}
	
}