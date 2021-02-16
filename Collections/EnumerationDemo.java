/*An Example on how to use Enumeration class with Hashtable */

import java.util.*;

class EnumerationDemo
{
	public static void main(String args[])
	{
		Hashtable  ht = new Hashtable();
		Integer i = new Integer(100);

		String s1= new String("First key");
		String s2= new String("Second key");
		String s3= new String("Third key"); 

		ht.put(s1,"First Value"); 
		ht.put(s2,"Second Value"); 
		ht.put(s3,i); 

		System.out.println(ht.get(s3));
		ht.put(s3,"Third Value"); 
		System.out.println(ht.get(s3));

	Enumeration  e = ht.keys(); // returns an enumeration object which can  be used to iterate thr'u list.
	System.out.println(e);

	while (e.hasMoreElements()) //used to find more elements
		System.out.println(e.nextElement());  //gives the next element

	}
}
 