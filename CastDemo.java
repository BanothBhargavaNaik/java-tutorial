class CastDemo
{
	public static void main(String args[])
	{
		int a = 5;
		long b = a; //Implicit/Automatic 
		float f=b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("f="+b);
		int c = (int) b; // Explicit casting
		float f2=4.3f;
		int i2=(int)f2;
		System.out.println("f2="+f2);
		System.out.println("i2= "+i2);
	}
}