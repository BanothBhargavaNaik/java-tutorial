// An example of Overloading a method to find the maximum of some numbers.
// In this case for each input one should have a seperate constructor as given below.
// For a maximum of 5 numbers another constructor must be provided.
// This problem overcomes using Var-args in java5.
// Try this program with java4
// This does not demonstrate the var-arg concept.

class Java_4_Overload 
{
	public static int max(int first, int second)
	{
		int x = first;
		int y = second;

		if(x>y)
		return x;

		else
		return y;
	}

	public static int max(int first, int second, int third, int fourth)
	{
		int a = first;
		int b = second;
		int c = third;
		int d = fourth;

		if(a>b && a>c && a>d)
		return a;
		
		else if(b>a && b>c && b>d)
		return b;

		else if(c>a && c>b && c>d)
		return c;

		else
		return d;
	}

	public static void main(String[] args) 
	{
		Java_4_Overload v = new Java_4_Overload();

		System.out.println(v.max(10,20));
		System.out.println(v.max(30,40,20,90));
	}
}
