// Another Example of Var-arg to fin the minimum of numbers.

class VarargDemo 
{
	public static int min(int first, int ... rest)
	{
		int min = first;
		for(int i :rest)
		{
			if(i<min)
			min = i;
		}
		return min;
	}

	public static void main(String[] args) 
	{
		VarargDemo v = new VarargDemo();

		System.out.println(v.min(10,20));
		System.out.println(v.min(30,40,20,90));
		System.out.println(v.min(57,45,30,68,29));
	}
}
