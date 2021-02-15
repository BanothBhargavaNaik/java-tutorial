/*
Parameters
----------
Values given to a method
Written inside call ()

syntax
------
Create
------
void method(type1 var1,type2 var2...)
{
	stmt;
	---
}

Call
----
obj.method(val1,val2....);

*/
class Param
{

	
	void add(int x,int y)
	{
		System.out.println("Add = "+(x+y));
	}
	
	void square(int x)
	{
		System.out.println("Square = "+x*x);
	}
	void Si(float p,float r,float t)
	{
		System.out.println("Si = "+(p*r*t/100));
	}
}




class ParamDemo
{
	public static void main(String args[])
	{
		Param p = new Param();
		
		p.add(65,34);
		p.square(17);
		p.Si(100,50,5);
	}
	
}