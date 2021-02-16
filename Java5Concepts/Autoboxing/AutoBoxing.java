// Upto java 1.4 If we want to convert Integer variable to int and int to Integer
// we use the following code. Compile & run this program in 1.4

class AutoBoxing
{
	public static void main(String[] args) 
	{
		int i=10;
		Integer j;

/*		j = i; This code is not supported
		i = j; It gives the compilation error	*/

		j = new Integer(i);
		i = j.intValue();

		System.out.println(i);
		System.out.println(j);
		
	}
}
