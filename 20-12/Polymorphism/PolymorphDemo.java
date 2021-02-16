class Assign
{
	int a,b;

	Assign(int x,int y)
	{
		a = x;
		b = y;
//		System.out.println("Values of a and b are:"+a);
	}
	int Area()
	{
		System.out.println("Dummy Implementation of Area");
		return 0;
	}
}
class Rectangle extends Assign
{
	Rectangle(int x, int y)
	{
		super(x,y);
	}	
	int Area()
	{
		System.out.println("Area of Rectangle is");
		return a*b;
	}

}
class Triangle extends Assign
{
	Triangle(int x, int y)
	{
		super(x,y);
	}	
	int Area()
	{
		System.out.println("Area of Triangle is");
		return a*b/2;
	}

}
public class PolymorphDemo
{
	public static void main(String[] args) 
	{
      Assign a1 = new Assign(10,10);
	  Rectangle r1 = new Rectangle(9,5);
	  Triangle t1 = new Triangle(10,8);
	  Assign a2;

	  a2 = r1;
	  System.out.println(a2.Area());
		
	  a2 = t1;
	  System.out.println(a2.Area());

	  a2 = a1;
	  System.out.println(a2.Area());

	}
}
