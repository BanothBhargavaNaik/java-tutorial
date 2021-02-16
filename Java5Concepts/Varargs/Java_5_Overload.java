//Enhanced 'for' and Var-args
// Here this program overcomes the problem of overloading in case of similer tasks.
// This program also demonstrates the Enhanced 'for' loop concept.


class Java_5_Overload 
{
	public static int max(int first, int ... rest)
	{
		int max = first;
		for(int i :rest)
		{
			if(i>max)
			max = i;
		}
		return max;
	}

	public static void main(String[] args) 
	{
		Java_5_Overload v = new Java_5_Overload();

		System.out.println(v.max(10,20));
		System.out.println(v.max(30,40,20,90));
		System.out.println(v.max(57,45,30,68,29));
	}
}
