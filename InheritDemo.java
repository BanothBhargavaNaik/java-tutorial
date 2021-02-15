/*
Inheritance
-----------
A class inheriting(receiving) values from another class is called inheritance

Parent/Super/Base class

	|
	|
	|
	|
	\/
	
Child/Sub/Derived class

syntax
------
keyword -extends

class B extends A

A- Parent
B- Child


*/


class A
{
	int a=7;
	void showA()
	{
		System.out.println("Value a = "+a);
	}
}

class B extends A
{
	int b=21;
	void showB()
	{
		super.a = 100;
		super.showA();
		System.out.println("Value b = "+b);
	}
}


class InheritDemo
{
	public static void main(String arg[])
	{
		B obj2 = new B();
		obj2.showB();	
	}
}