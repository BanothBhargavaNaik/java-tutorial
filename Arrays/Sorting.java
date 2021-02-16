/*Genesis Solutions Pvt Ltd. Phone no:27551578,27555985*/
/*Faculty: Mr.Neil Gogte*/

/* Sorting of elements of an array */

class Sorting
{
		int a[] = {5,4,7,3,9,1,6,2,8};
		int temp;

	Sorting()
	{
       sortProcess();
	   displayValues();
	}
 void sortProcess()
	{
		for(int i=0;i<a.length;i++)
		{
		  for(int j=i+1;j<a.length;j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
 void displayValues()
	{
		System.out.println("Sorted Elements ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("  "+a[i]);
		}

	}
	public static void main(String[] args) 
	{
		Sorting s = new Sorting();
		
	}
}/*~Itsraj~*/
