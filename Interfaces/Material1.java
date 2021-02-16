/* this is the implementation class for Accounting1 */
/* *** This program gives a compilation error since the class
			doesn't provide the body for all methods ***** */

public class Material1 implements Accounting1
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
	
	public static void main(String[] args) 
	{
		Material m = new Material();
		System.out.println(m.getCPrice());
		System.out.println(m.getWeight());
	}
}
