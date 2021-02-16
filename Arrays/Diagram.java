/*Genesis Solutions Pvt Ltd. Phone no:27551578,27555985*/
/*Faculty: Mr.Neil Gogte*/


/* To dispaly the following 

					 I N D I A A I D N I
					 I N D I     I D N I
					 I N D         D N I
					 I N             N I
					 I                 I             */

class Diagram 
{
	public static void main(String[] args) 
	{
		char ch[] = {'I','N','D','I','A'};
        int pos = ch.length; 
		int space = 1;
		for(int i=1;i<=ch.length;i++)
		{
			for(int j=0;j<pos;j++)
			{
              System.out.print(" "+ch[j]);
			}
			if(i>0)
			{
              for(int k=1;k<space;k++)
				{
                  System.out.print("    ");//4 spaces
				}
				space++;
			}

			for(int l=pos-1;l>=0;l--)
			{
			   System.out.print(" "+ch[l]);
			}
			pos--;
			System.out.println("");
		}

		
	}
}
/*~Itsraj~*/