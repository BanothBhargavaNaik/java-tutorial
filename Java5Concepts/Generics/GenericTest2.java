// Another Example of Hasftable 

import java.util.Hashtable;

class GenericTest2
{
	public static void main(String[] args)
	{
		Hashtable<String , Double > ht = new Hashtable<String , Double>(); //creating a hashtable constructor

		ht.put("Name1", 3434.34);
		ht.put("Name2", 123.22);
		ht.put("Name3", 1378.00);
		ht.put("Name4", 99.22);
		ht.put("Name5", -19.08);

		String s = h.get(123.22);  //here no need of typecast since java 5 supports autoboxing
		System.out.println(s);

		/* Try this program by changing the put parameters */
		// The compiler gives an error even if the fields are interchanged
	}
}