/* this is the implementation class for interfaces */

public class Material3 implements Warehouse 
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
		Material3 m = new Material3();
		System.out.println(m.getCPrice());
		System.out.println(m.getWeight());
	}
}
