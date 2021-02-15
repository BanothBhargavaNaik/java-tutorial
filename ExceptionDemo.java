/*

Exception handling
------------------

Exception - It is an error due to which the program cannot continue

Run Time Exception

Keywords
========
try,catch,throw,throws,finally


syntax
======

try
{
	stmt;
	-=-
}
catch(Exception e)
{
	stmt;
	---
}

try - If an exception occurs in the try block, it goes to catch
catch - It catches the exception

Exceptions
----------

1. ArithmeticException
2. InputMismatchException
3. ArrayIndexOutOfBoundsException
*/


/*
class ExceptionDemo
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

		System.out.println("After exception");
	}

*/


/*
import java.util.*;
class ExceptionDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String name
         System.out.print("enter name:");
		 name=sc.nextln();
		
	
		try
		{
	       good;
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}

		System.out.println("After exception");
	}
	*/
	
	
	
	
	class ExceptionDemo
{
	public static void main(String args[])
	{
		int a,r=6
		a=1;
		if(a<=r)
		{
	     System.out.println(a);
         a++;
		}		 
	
		try
		{
			r=7;
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}

		System.out.println("After exception");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	