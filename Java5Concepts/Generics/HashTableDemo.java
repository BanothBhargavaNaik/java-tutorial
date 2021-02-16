// An example of how to create Hashtables in java upto jdk1.4
// Run this program with java version less than jdk1.5

import java.util.Hashtable;

class HashTableDemo
{
public static void main(String[] args)
{
	Hashtable h = new Hashtable();  //create a Hashtable

	h.put(new Integer(0), "value"); //put some values into the Hashtable

	String s = (String)h.get(new Integer(0));
	System.out.println(s);
}
}