
class rectangle 
{
	double width;
	double height;
	 void area()
	{
	  
	      System.out.print("Area of rectangle is :");
		  System.out.print(width*height);
		  
	}
	public static void main(String[] args) 
	{
		rectangle r=new rectangle();
		r.width=10;
		r.height=5;
		r.area();
	}
}
