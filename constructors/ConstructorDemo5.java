/* Program to illustrate the use multiple constructors */
/*Bits and Bytes Computer Education -Hanamkonda-9866129388*/
/*Faculty: Mr.SADASHIV.*/

class ConstructorDemo5 
{
	double PI = 3.14;
	double r;
	double x,y,z;
	
	ConstructorDemo5()
	{
		r = 1.0;
		x = 1.1;
		y = 2.2;
		z = 3.3;
	}

	ConstructorDemo5(double r,double x, double y,double z) //constructor with 4 parameters
	{
		this.r = r; //here 'this' is a keyword which represents to current object(class) 
		this.x = x; 
		this.y = y;
		this.z = z;
	}

	double getVolume()
	{
		return ((4.0/3.0)*(PI*r*r*r))+(x+y+z);
	}

	public static void main(String[] args) 
	{
		ConstructorDemo5 cd1 = new ConstructorDemo5();// with default
		ConstructorDemo5 cd2 = new ConstructorDemo5(2.2,3.3,4.4,5.5); //with parameterized

		System.out.println("Volume from a default Constructor is: ");	
		System.out.println(cd1.getVolume());	
		System.out.println("Volume from a parameterised constructor is: ");	
		System.out.println(cd2.getVolume());	
	}
}
	