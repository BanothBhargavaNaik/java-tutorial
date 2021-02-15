/*
Method Overriding
-----------------
The overriding of a parent class method by a derived class method
happens when the methods have the same signature(name,parameters)


*/

class P
{
	void method1()
	{
		System.out.println("Parent class method 1");
	}
	void method2()
	{
		System.out.println("Parent class method 2");
	}
	void method3()
	{
		System.out.println("Parent class method 3");
    }
}
class C extends P
{
	void method1()
	{
		System.out.println("Child class method 1");
	}
	void method2()
	{
		System.out.println("child class method 2");
	}
}


class MO
{
	public static void main(String args[])
	{
		P objp = new P();
		objp.method1();
		
		
		C objc = new C();
		objc.method1();
		objc.method2();
		objc.method3();
	}
	
}