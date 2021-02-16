/*
static methods;
the methods which depends on class name ratherthan object are called as static or class methods.

these methods can access only other static members of class.
all modifier all valid on these members.(public,private,protected);

*/


class StaticDemo 
{
	static int  x=27;
	static int y=45;
	static void show()
	{
		System.out.println("x="+x);
	}
static void show(int a,int b)
	{
		x=a;y=b;
		System.out.println("x="+x);
       System.out.println("y="+y);
	}
	}

	class StaticDemo1 extends StaticDemo
	{
		/* void show(int a,int b)	{
		x=a;y=b;
		System.out.println("x="+x);
       System.out.println("y="+y);
	}*/
	
		public static void main(String[] args) 
	{
	     StaticDemo.show();
		 System.out.println("Y= "+StaticDemo.y);
		StaticDemo1 s= new StaticDemo1();
		 //s.show(2,5);
	
	}
}
