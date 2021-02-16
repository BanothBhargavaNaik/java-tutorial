
/*Genesis Solutions Pvt Ltd. Phone no:27551578,27555985*/
/*Faculty: Mr.Neil Gogte*/

/* To enter the values into an array Randomly */

class RandomTest 
{
	public static void main(String[] args) 
	{

		double[] d = new double[20];
		int i;
		for( i=0;i<d.length;i++)
		{
			d[i] = 100.0*Math.random();
		}
		for(i=0;i<d.length;i++)
		{

          System.out.println(d[i]);
		}
	}
}
/*~Itsraj~*/