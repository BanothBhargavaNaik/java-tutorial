//static import
/* Upto java4 we used the method sqrt of math class not directly but by Math.sqrt()
   Using static import no need calling the method with the classname.methodname extension
*/

import static java.lang.Math.*;

class StaticDemo1 
{
	public static void main(String[] args) 
	{
		double i = sqrt(25);  // In java4 we said Math.sqrt(25);
		System.out.println(i);

		int j = abs(-10);
		System.out.println(j);
	}
}
