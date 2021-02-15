/*

super keyword
-------------
Used to access Parent/Super class members

syntax
------

method
------
super.method();

variable
-------
super.var = val;

Constructor
-----------
super();
super(var/value);

*/

class A
{
	A()
	{
		System.out.println("Constructor A called");
	}
	
	A(int x)
	{
		System.out.println("Constructor A called " + x);
	}
}

class B extends A
{
	B()
	{
		System.out.println("Constructor B called");
	}
	
	B(int x)
	{
		//super();
		super(x); //Calls A(int x) constructor
		System.out.println("Constructor B called " + x);
	}
}

class CInh
{
	public static void main(String args[])
	{
		B obj = new B(7);
	}
}