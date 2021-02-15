/*

Interface
---------
Interface is similar to a abstract class in which methods do not have a body

By default, the variables and methods are public,static and abstract 
Interface cannot be instantiated
Interface can be implemented as well as extended
Overriden methods must be public

One class can implement more than one interface 

syntax
------
interface name
{
int a;
void method();
}

Inheritance
-----------

interface ---> class  (implements)
interface ---> interface (extends)



class ---> class (extends)
class ---> interface (not possible)


*/

interface Inter
{
	void method();
}

interface Two
{
	void method();
}

class SubInter implements Inter,Two
{
	public void method()
	{
		System.out.print("I am subinter method");
	}
}

class InterfaceDemo
{
	public static void main(String args[])
	{
		//Inter i = new Inter();
		SubInter s = new SubInter();
		s.method();
	}
}






