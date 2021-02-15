import java.util.*;
class ExceptionExample
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b=0;
		int[] arr = new int[5];
	
		try
		{
		a=sc.nextInt();
		arr[5] = 10;
		a=5/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception caught");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("AIOOB caught");
			e.printStackTrace(); //To print the exception details
		}
		catch(InputMismatchException e)
		{
			System.out.println("INPut MM caught");
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}

		System.out.println("After exception");
	}
	
}
	