//program for packages and Constructor
//Compile it normally and run this by packagename.classname

package mypack;

class Balance 
{
	String name;
	double bal;

	Balance(String n, double b)  //this is the parameterised constructor
	{
		name = n;
		bal = b;
	}
	void show()
	{
		System.out.println("name:" +name  + "Balance:" +bal);
	}
}