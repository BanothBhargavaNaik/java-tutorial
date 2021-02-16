//Program for Annotation 

/* An Example program to show the Deprecated annotation.
   Run this program in java 1.4 and in java 1.5 and find the difference.

   First try this way and then make few changes as given in AnnotationDemo3.java.
*/

public class AnnotationDemo2
{
	@Deprecated public void method1()
	{
		System.out.println("Method1 uses the old procedure ");
	}

	public void method2()
	{
		System.out.println("Method2 uses the new  procedure");
	}

	public static void main(String args[])
	{
		AnnotationDemo2 d = new AnnotationDemo2();

		d.method1();
		d.method2();
	}
}
