//Program for Annotation 

/* An Example program to show the Deprecated annotation.
   Run this program in java 1.4 and in java 1.5 and find the difference.
   Now in this program change the code slightly by overriding the method1 of BaseClass 
   as shown below.
   
   When you compile this code you will find the following warning!!!!

   Note: AnnotationDemo3.java uses or overrides a deprecated API.
   Note: Recompile with -Xlint:deprecation for details.
*/

class BaseClass
{
	@Deprecated public void method1()
	{
		System.out.println("Method1 uses the old procedure ");
	}

	public void method2()
	{
		System.out.println("Method2 uses the new  procedure");
	}
}
class AnnotationDemo3 extends BaseClass
{
	public void method1()
	{
		System.out.println("Overridden Method of Base Class");
	}
	public void method3()
	{
		System.out.println(" Method3 of Derived Class");
	}
	public static void main(String args[])
	{
		AnnotationDemo3 d = new AnnotationDemo3();
		BaseClass b = new BaseClass();

		b.method1();
		d.method1();
	}
}
