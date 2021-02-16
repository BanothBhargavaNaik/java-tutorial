// Program for Auto Boxing, printf
/* From java 1.5 the conversion from int to Integer and Integer to int can be directly done.
   The following program shows how to do it. Run this program in java 5.
   Observe the output of both programs.
*/

class AutoBoxing1
{
	public static void main(String[] args) 
	{
		int i=10;
		Integer j;
		j = i;
		i = j;
		System.out.println("using println "+i+ " "+j);

		System.out.printf("Using printf i = %d  j = %d",i,j);
	}
}
