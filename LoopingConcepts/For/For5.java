/* This program Demostrates how to form a
	 pascal triangle using for loop.
*/
/*				        1
					  1 1
					 1 2 1
					1 3 3 1
				   1 4 6 4 1
				  1 5 10 10 5 1
				 1 6 15 20 15 6 1	*/

public class For5
{  
   int space=15,x;
	For5()
	{

	for(int i=0;i<=6;i++)
		{
            for(int j=0;j<=space;j++)
			{
                 System.out.print(" ");
			}
			space--;
			for(int k=0;k<=i;k++)
			{
                x = fact(i)/(fact(k) * fact(i-k));
					System.out.print(" "+x);
			}
			System.out.println();
				 
		}
	}

int fact(int n)
	{
	   int f=1;
        if(n == 0)
		{
            return 1;
		}
		else
		
               for(int i=1;i<=n;i++)
			     {
                      f = f * i;         
			     }

		return f;
	}
	public static void main(String args[])
	{
	       For5 f = new For5();
    }

}
