/*Bits and Bytes Computer Education -Hanamkonda-9866129388*/
/*Faculty: Mr.SADASHIV.*/
//Overload

class Demo
{
	public void test()
	{
	System.out.println("Dummy method");
	}
	public void test(int i)
	{
		System.out.println("i=" +i);
	}
	public int test(int i, int j)
	{
		return i+j;
	}
	public double test(double a)
	{
		return a*a;
	}
}

class Overload
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		double d1 = 10.10;		
		d.test();
		d.test(10);
		System.out.println(d.test(20,30));
		System.out.println(d.test(d1));
		System.out.println(d.test(25.25));
	}
}
