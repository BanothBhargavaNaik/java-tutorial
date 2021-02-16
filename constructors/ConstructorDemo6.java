
class Constructor2Constructor
{
	double PI = 3.14;
	double r;
	double x,y,z;
	int cnt = 0;

	Constructor2Constructor() //default constructor
	{
		r = 1.1;
		x = 0.0; y = 0.0; z = 0.0;
		++cnt;
	}

	Constructor2Constructor(double x, double y, double z)//constructor with 2 parameters
	{
		this();// it calls default constructor of class.
		this.x = x;
		this.y = y;
		this.z = z;
	}

	Constructor2Constructor(double r, double x, double y,double z) //constructor with 4 parameters
	{
		this(x, y, z); // it calls parameterized constructor of this class.
		this.r = r; 
	}

	int getCount()  //some dummy body for method
	{
		return cnt;
	}

	double getVolume()
	{
		return ((4.0/3.0)*(PI*r*r*r))+(x+y+z);
	}
}

public class ConstructorDemo6
{
	public static void main(String[] args) 
	{
		Constructor2Constructor cc1 = new Constructor2Constructor();
		System.out.println("First Object");
		System.out.println(""+cc1.getCount() +"    "+ cc1.getVolume());

		cc1 = new Constructor2Constructor(2.2,3.3,4.4);
		System.out.println("Second Object");
		System.out.println(""+cc1.getCount() +"     "+ cc1.getVolume());

		cc1 = new Constructor2Constructor(4.4,5.5,6.6,7.7);
		System.out.println("Third Object");
		System.out.println(""+cc1.getCount() +"    "+ cc1.getVolume());
	}
}
/*~Itsraj~*/