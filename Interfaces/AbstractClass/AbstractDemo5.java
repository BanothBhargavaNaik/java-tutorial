/* this is the implementation class for Accounting1 */
/* *** This program gives a compilation error since the class
			doesn't provide the body for all methods of interface.
			Hence it should be declared abstract ***** */
//Try to compile this program with and without abstract keyword . Account1 must be in current path.

public abstract class AbstractDemo5 implements Accounting1
{
	public float getCPrice()
	{
		System.out.println("method for cost price");
		return 100;
	}

	public float getSPrice()
	{
		System.out.println("method for Selling price");
		return 200;
	}
// An abstract class cannot be instantiated.

/*	public static void main(String[] args) 
	{
		Material m = new Material();
		System.out.println(m.getCPrice());
		System.out.println(m.getWeight());
	}*/	 
}

/*   ---SOME NOTES---
	  In this type of case we should have another class which extends this AbstractDemo5 
	  and provides body for remaining methods to run the application gracefully.
	  Look at the Demo1.java for this implementation.

	  The other solution is write an adapter class which implements the interface and provides 
	  dummy body for all methods. Now use this class in your application by extending it to our
	  class and use only methods that are necessary. That is override the Base class method.
	  The AdapterDemo.java and Demo2.java illustrates this example.

*/
	  