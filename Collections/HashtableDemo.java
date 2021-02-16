/*An Example on how to create Hashtable */

import java.util.*;

class HashtableDemo{
	public static void main(String args[])
{
		Hashtable  ht = new Hashtable();
		Integer i = new Integer(100);

		// A set of  key , value pairs is called hashtable
		// this speads up the process of searching for an element

		String s1= new String("First key");
		String s2= new String("Second key");
		String s3= new String("Third key"); 

		//here  any java object can be used as a value which has no use
		//this defect is overcomed by the Generics of Java5.

		ht.put(s1,"First value");  //Here the value can be either String or Integer
		ht.put(s2,"Second Value"); 
		ht.put(s3,i); 
		System.out.println(ht.get(s3));
		ht.put(s3,"Third Value"); 
		System.out.println(ht.get(s3));

	}
}
 