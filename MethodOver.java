/*

Method Overloading
------------------
In a single class, more than one method having the same name

The method name can be same but method signature must be different

1. Number of parameters

Ex:
void add(int x,int y)
void add(int x,int y,int z)

2. Datatype of Parmeters

Ex:
void add(int x,int y)
void add(float x,float y)

3. Order of parameters

Ex:
void add(int x,float y)
void add(float x,int y)

*/



class Over
{

int add(int x,int y)
{
	return x+y;
}

int add(int x,int y,int z)
{
	return x-y-z;
}

float add(float x,float y)
{
	return x*y;
}

float add(float x,int y)
{
	return x/y;
}

float add(int x,float y)
{
	return x%y;
}
}

class MethodOver
{
	public static void main(String args[])
	{
		Over o = new Over();
		
		System.out.println("two int Param: "+o.add(5,6));
		System.out.println("three int Param: "+o.add(1,2,3));
		System.out.println("two float Param: "+o.add(-1.2f,5.6f));
		System.out.println("int float Param: "+o.add(5,4.7f));
		System.out.println("float int Param: "+o.add(7.4f,5));
	}
}