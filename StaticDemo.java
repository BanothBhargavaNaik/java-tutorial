/*

static
------
static keyword can be used on variables and methods


static variables
----------------

Variables - instance variables
				Separate for each object
			static/class variables
				Common for all objects/Belong to the class
				
				
				
syntax
------
static type var;

*/


class S
{
	static int a=1;
	
	void increment()
	{
		a++;
	}
	
	void show()
	{
		System.out.println("a = "+a);
	}
}

class StaticDemo
{
	public static void main(String args[])
	{
		S obj1 = new S();
		S obj2 = new S();
		
		obj1.show();
		obj2.show();
		
		obj1.increment();
		obj1.show();
		
		obj2.increment();
		obj2.show();
		obj1.show();
	}
}
