
class ConstructorDemo4 
{
	double PI = 3.14;
	double cnt = 0;
	double r;
	double x,y,z;

	ConstructorDemo4(double r,double x, double y,double z) //constructor with 4 parameters
	{
		this.r = r; //here 'this' is a keyword which represents to current object(class) 
		this.x = x; //look in keyword folder for more examples
		this.y = y;
		this.z = z;
	}
	double getCount()  //some dummy body for method
	{
		cnt = x+y+z;
		return cnt;
	}
	double getVolume()
	{
		return ((4.0/3.0)*(PI*r*r*r));
	}
	public static void main(String[] args) 
	{
		ConstructorDemo4 cd4 = new ConstructorDemo4(2.2,3.3,4.4,5.5);// calling parameterized constructor
		System.out.println(cd4.getCount());	
		System.out.println(cd4.getVolume());	
	}
}
