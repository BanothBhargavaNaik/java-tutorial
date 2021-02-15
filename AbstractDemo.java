/*

Abstract Class
-------------
A class preceeded by the keyword word abstract
An abstract class contains abstract methods

Abstract method - methods without a body
Abstract method must be overrided in the inherited class

An abstract class cannot be instantiated(create an object)

*/

abstract class Demo
{
	abstract void method();
	void method2()
	{
		System.out.println("Normal method2");
	}

}

class Sub extends Demo
{
	void method()
	{
		System.out.println("Overrided abstract method");
	}
}

class AbstractDemo
{
	public static void main(String args[])
	{
		//Demo d = new Demo();
		Sub s = new Sub();
		s.method();
		s.method2();
	}
}