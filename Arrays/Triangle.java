
/*Genesis Solutions Pvt Ltd. Phone no:27551578,27555985*/
/*Faculty: Mr.Neil Gogte*/

/* To display the following output
		 E
       F E E
     F F E E C
   O F F E E C U
 C O F F E E C U P     */

class Triangle 
{
	public static void main(String[] args) 
	{
		char ch[] = {'C','O','F','F','E','E','C','U','P'};
		int mid = (ch.length/2)+1;
		int pos1 = 4,pos2 = 5,space=15;
       
	    for(int i = 0; i<5;i++)
		{
		   for(int j = 1; j<=space;j++)
			{
			   System.out.print("  ");  // two spaces
			}
		    space--;
           for(int k=pos1;k<mid;k++)
			{
				System.out.print(" "+ch[k]);
			}
			for(int l=mid;l<pos2;l++)
			{
              System.out.print(" "+ch[l]);
			}
			pos1--;
			pos2++;
			System.out.println();
		}
	}
}
/*~Itsraj~*/