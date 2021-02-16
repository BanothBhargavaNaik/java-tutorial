// Calling constructors with "this." keyword

public class ThisDemo2 
{
	int petalCount = 0;
	String s = new String("null");
	ThisDemo2(int petals) 
	{
		petalCount = petals;
		System.out.println("Constructor w/ int arg only, petalCount= "+ petalCount);
	}

	ThisDemo2(String ss) 
	{
		System.out.println("Constructor w/ String arg only, s=" + ss);
		s = ss;
	}

	ThisDemo2(String s, int petals) 
	{
		this(petals);
		//! this(s); // Can't call two!
		this.s = s; // Another use of "this"
		System.out.println("String & int args");
	}

	ThisDemo2() 
	{
		this("hi", 47);
		System.out.println("default constructor (no args)");
	}

	void print() 
	{
		//! this(11); // Not inside non-constructor!
		System.out.println("petalCount = " + petalCount + " s = "+ s);
	}

	public static void main(String[] args) 
	{
		ThisDemo2 x = new ThisDemo2();
		x.print();
	}
}