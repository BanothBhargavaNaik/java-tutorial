// An example of generics 
/* The difference between HashTableDemo's Hashtable and here is that 
   For example, instead of simply defining a class Hashtable, we could define a generic class Hashtable<Key, Value> in
   which Key and Value are type parameters.
*/

// Run this program in jdk1.5 or greater version

import java.util.Hashtable;

class GenericTest1
{
	public static void main(String[] args)
	{
		Hashtable<Integer, String> h = new Hashtable<Integer, String>(); //creating a hashtable constructor

		h.put(new Integer(0), "value"); //putting values

		String s = h.get(0);  //here no need of typecast since java 5 supports autoboxing
		System.out.println(s);

		/* Try this program by changing the put parameters other than Integer and String */
		// The compiler gives an error even if the fields are interchanged
	}
}