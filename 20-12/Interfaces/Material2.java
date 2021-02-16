/* this is the implementation class for interfaces */
/* Calling of interface methods using a common object.
	An example of this is given below  
*/

public class Material2 implements Accounting,Warehouse 
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
	public String getType()  
	{
		System.out.println("Type of material is:");
		return "iron";
	}
	public float getWeight()
	{
		System.out.println("weight of material is");
		return 2000;
	}
	public static void main(String[] args) 
	{
		Accounting a = new Material();
		System.out.println(a.getCPrice());
		System.out.println(a.getSPrice());
		System.out.println(a.getWeight());  //This return an error

/*		Try the output with following code also:
		Warehouse w = new Warehouse();
		System.out.println(w.getType());
		System.out.println(w.getWeight());
		System.out.println(w.getCPrice());  //This return an error*/
	}
}
