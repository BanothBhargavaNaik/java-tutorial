/*Bits and Bytes Computer Education -Hanamkonda-9866129388*/
/*Faculty: Mr.SADASHIV.*/
/* A simple example of Overloading */

class OverLoadDemo1 
{
	void OLMethod(String msg)
	{
      System.out.println(msg);
	}
	void OLMethod(int a)
	{
      System.out.println("The Value Of a Is : "+a);
	}
	void OLMethod(int a,int b)
	{
      System.out.println("Adding Of Two Values : "+(a+b));
	}

	public static void main(String[] args) 
	{
		OverLoadDemo1 old = new OverLoadDemo1();
        old.OLMethod("Performing Simple Overloading Demo");
		old.OLMethod(80);
		old.OLMethod(100,50);
	}
}
