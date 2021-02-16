/* An Example of Reflection Which gives the following details when a class is given */

import java.lang.reflect.*;

public class ReflectionDemo 
{
	public static void main(String[] args) 
	{										   
		try
		{
			Class c = Class.forName(args[0]);  //Here Demo is a class which has construcotrs, few fields and methods 
											  //This class should be in classpath & accessible here.
			System.out.println("Constructors:");
			Constructor constructors[] = c.getConstructors();
			for(int i=0;i<constructors.length;i++)
			{
				System.out.println("   " +constructors[i]);
			}

			System.out.println("Fields:");
			Field fields[] = c.getFields();
			 for(int i=0;i<fields.length;i++)
			{
				System.out.println("   " +fields[i]);
			}

			System.out.println("Methods:");
			Method methods[] = c.getMethods();
			 for(int i=0;i<methods.length;i++)
			{
				System.out.println("   " +methods[i]);
			}
		}//try
		 catch (Exception e)
		{  		 System.out.println("   Exception:" +e);   }
	}
}
