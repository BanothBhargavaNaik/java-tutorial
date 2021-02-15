/*


Access specifiers
-----------------
Used to change the accessibilty of the variable or method

public 
- can use anywhere
private
- can be used only within the class
protected
- can be used only within the program and its inherited classes

syntax
------
<access> type var;
*/

class Base
{
	public int a =10;
	private int b = 20;
	protected int c = 30;
	
	void showb()
	{
		System.out.println("a = "+a);	
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}
}

class Derived extends Base
{
	void showd()
	{
		System.out.println("a = "+a);	
		//System.out.println("b = "+b);
		System.out.println("c = "+c);
	}
	
}

class AccessDemo
{
	public static void main(String args[])
	{
		System.out.println("\n\nInside main class");
		
		Base b1 = new Base();
		System.out.println("a = "+b1.a);	
		System.out.println("c = "+b1.c);	
		//System.out.println("b = "+b1.b);	.
		
		System.out.println("\n\nUsing method of the class");
		b1.showb();
		
		System.out.println("\n\nInside Inherited class");	
		
		Derived d = new Derived();
		d.showd();
		
	}
}