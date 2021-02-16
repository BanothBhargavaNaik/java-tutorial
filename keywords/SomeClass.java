// static methods are not allowed to use non static features of their class
class  SomeClass{
	static int  i =48;
	static int j=1;
	public static void main(String args[])
	{
		i += 100;
		// j* = 5;//Illegal
		//if static method needs to acess a non static variable, 
		//it must specify which instance of its class owns the variable
		SomeClass s1 = new SomeClass();
		 s1.j *= 5;
		 System.out.println("Value of j:"+j);
	}
}

