//An Example of reflection where the information regarding consructors is retrieved */

import java.lang.reflect.*;

public class ReflectionDemo1 
{
	public static void main(String[] args) 
	{									
		Demo d = new Demo();
		Demo1 d1 = new Demo1(10);
		try
		{
			Class c = Class.forName("Demo");  //Here Demo is a class which has construcotrs, few fields and methods 
											  //This class should be in classpath & accessible here.
			System.out.println("Constructors:");
			Constructor constructors[] = c.getConstructors();
			for(int i=0;i<constructors.length;i++)
			{
				System.out.println("   " +constructors[i]);
				constructors[i].equals(d);  //where demo is one class
				constructors[i].equals(d1);// here demo1 is another class
				System.out.println(constructors[i].getName()); //gives the name of the constructors
				System.out.println(constructors[i].getModifiers()); //give the type of modifier (like: abstract,final,public.protected etc)
																	//for more modifiers refer api
			}

			
		}//try
		 catch (Exception e)
		{  		 System.out.println("   Exception:" +e);   }
	}
}


/*					    *****NOTES***********

	 In the same way individual Method class or Field class has many functions based on which 
	 complete details of any java file given class file can be retrieved or changed  
*/