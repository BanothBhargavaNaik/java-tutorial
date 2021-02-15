/*
Methods
-------

syntax
------

type fun()
{
	stmt;
	--
	return var;
}

Create
------
void method()
{
	stmt;
	--
}

Call
----
obj.method();





*/

class Rectangle
{
	int l,b;
	
	void area()
	{
		System.out.println("Area = "+l*b);
	}
	

}




class MethodDemo
{
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		r1.l = 5;
		r1.b = 7;
		r1.area();
		
		Rectangle r2 = new Rectangle();
		r2.l = 100;
		r2.b = 8;
		r2.area();
		
	}
	
}