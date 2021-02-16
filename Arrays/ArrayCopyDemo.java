/*Genesis Solutions Pvt Ltd. Phone no:27551578,27555985*/
/*Faculty: Mr.Neil Gogte*/


/* Program to demonstrate the use of arraycopy method */

public class ArrayCopyDemo
{
public static void main(String[] args)
	{
		char[] copyFrom = {'r','a','j','m','a','d','h','u','n','a','g'};
		char[] copyTo=new char[7];
		System.arraycopy(copyFrom,0,copyTo,3,3);
		System.arraycopy(copyFrom,8,copyTo,0,3);   //check the output by changing the last two values
		System.out.println(new String(copyTo));
		}
}/*~Itsraj~*/