
/*Genesis Solutions Pvt Ltd. Phone no:27551578,27555985*/
/*Faculty: Mr.Neil Gogte*/

/* An example of Arrays */

class ArrayHowTo 
{
	public static void main(String[] args) 
	{
		char ch[] = {'I','N','D','I','A'};

		int a[] = {1,5,2,7,4};

		int b[] = new int[5];

		String str[] = {"Java : : ","New ","Wine ","In ", "Old ","Cups"}; 

	    System.out.println("\nCharacter Values\n");
		for(int i=0;i<ch.length;i++)
		{
           System.out.print(ch[i]);
		}
	    System.out.println("\n\nValues of Array A\n");
		for(int i=0;i<a.length;i++)
		{
           System.out.print("  "+a[i]);
		   b[i] = a[i]+10;
		}
	    System.out.println("\n\nValues Array B\n");
		for(int i=0;i<b.length;i++)
		{
           System.out.print("  "+b[i]);
		}
		System.out.println("\n\nValues Of String Array\n");
		for(int i=0;i<str.length;i++)
		{
           System.out.print(str[i]);
		}

	}
}
/*~Itsraj~*/