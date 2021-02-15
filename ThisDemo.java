/*

this keyword
------------
Used to refer to the calling object

syntax
------
this.var;


*/

import java.util.*;

class A
{
	int a,b;
	Scanner sc = new Scanner(System.in);
	
	void accept()
	{
		System.out.println("Enter two num");
		a = sc.nextInt();
		b = sc.nextInt();
	}
	
	void accept(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	
	void show()
	{
		System.out.println(" a = "+a+" b = "+b);
	}
	
}

class ThisDemo
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.accept(5,3);
		obj.show();
	}
}
