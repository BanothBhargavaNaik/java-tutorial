class circle
{
	float r,a,b;
}

class OppDemo
{
	public static void main(String args[])
	{
		circle p=new circle();
		p.r=5.3f;
		p.a=4.3f;
		p.b=2.3f;
		System.out.println("area="+(3.14*p.r*p.r));
		System.out.println("circum="+(2*3.14*p.r));
		System.out.println("area of sqr="+(p.a*p.a));
		System.out.println("area of rightangel="+(0.5*p.a*p.b));
		
	}
}
	
