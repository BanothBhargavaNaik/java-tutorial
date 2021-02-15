/*
final keyword
-------------
final is used to make variables,methods and classes constant

varible - value cannot be changed
method - method can be overrided
class - cannot be inherited

*/

final class Demo
{
	final int a = 100;
	
	final void method()
	{
		
	}
}

class Sub extends Demo
{
	void method()
	{
		
	}
}

class FinalDemo
{
	public static void main(String args[])
	{
		Demo d = new Demo();
		System.out.println(d.a);
		//d.a =10;
	}
}