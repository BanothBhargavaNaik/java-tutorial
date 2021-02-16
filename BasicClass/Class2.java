/*Bits and Bytes Computer Education -Hanamkonda-9866129388*/
/*Faculty: Mr.SADASHIV.*/


/*this class invokes a method m1() of Class1.Hence extended to Class1
*/

class Class2 extends Class1
{
   void m2()
	{
       System.out.println("This is Class2's method");
	}
	public static void main(String args[])
	{
       Class2 i = new Class2();
	    i.m2();
		i.m1();
	}

}
