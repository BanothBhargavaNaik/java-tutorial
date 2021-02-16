// use of 'this' keyword

class  Test
{
	int x, y;
	public void method1(int x, int y)
	{
		this.x = x;
		this.y = y;
		System.out.println("x= " +x + "y =" +y);
	}
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.method1(10,20);
	}
}








/*
//use of super keyword
class  Test
{
	public void method1()
	{
		System.out.println("Method of Test");
	}
}
	class Test1 extends Test
	{
		public void method1()
		{
		super.method1();
		}
	public static void main(String[] args) 
	{
		Test1 t = new Test1();
		t.method1();
	}
}
*/
