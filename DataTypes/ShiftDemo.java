/* This  Program is a simple java Application showing that
	 leftshift (>>) , rightshift (<<) cannot be used on float and double.
*/

class ShiftDemo{ 

	public static void main(String args[])
	{
		float a = 22.22f;
		double d =33.33;
		//float b= a<<2;          // Remove the comments & check the compilation error ?
		//int c = (int)(a <<2); // Remove the comments & check the compilation error ?
		int c = (int)a <<2;      //This runs gracefully
		c = (int)d<<1;
		System.out.println(" c = " + c);
	}	
}

/*




*/