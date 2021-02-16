//Program for Annotation 

/* An Example program to show the Override annotation.
   Run this program in java 1.4 and in java 1.5 we will find no difference.

   But suppose make a small change to AnnotationDemo1 class (ie) just type name
   of the method to be overrided wrong (ie) metod2 in this case and now check the 
   output with the java 1.4 and 1.5 and find the difference between above and below 
   compilation of programs.
*/

class  BaseClass
{
	public void method1()
	{
		System.out.println("Method1 of Base Class");
	}

	@Override public void method2()
	{
		System.out.println("Method2 of Base Class");
	}
}

class AnnotationDemo1 extends BaseClass
{
	public void method2()
	{
		System.out.println("Overridden Method of Base Class");
	}
	public void method3()
	{
		System.out.println(" Method3 of Derived Class");
	}
	public static void main(String args[])
	{
		AnnotationDemo1 d = new AnnotationDemo1();
		BaseClass b = new BaseClass();

		b.method2();
		d.method2();
	}
}
