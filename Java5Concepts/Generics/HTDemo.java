// Demonstrate a Hashtable

import java.util.*;

class HTDemo
{
	public static void main(String args[])
	{
		Hashtable ht = new Hashtable();  //default constructor
		
		Enumeration names;
		String str;
		double bal;

		ht.put("Name1", new Double(3434.34));
		ht.put("Name2", new Double(123.22));
		ht.put("Name3", new Double(1378.00));
		ht.put("Name4", new Double(99.22));
		ht.put("Name5", new Double(-19.08));

		// Show all hts in hash table.
		names = ht.keys();
		while(names.hasMoreElements())
		{
		str = (String) names.nextElement();
		System.out.println(str + ": " +
		ht.get(str));
		}
		System.out.println();

		// Deposit 1,000 into John Doe's account
		bal = ((Double)ht.get("John Doe")).doubleValue();
		ht.put("John Doe", new Double(bal+1000));
		System.out.println("John Doe's new ht: " +
		ht.get("John Doe"));
	}
}