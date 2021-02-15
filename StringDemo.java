/*

primitive - basic types used to make other types or classes
EX: int,float,char.....




String
------
Strings are collection of characters

Strings are constant/immutable (cannot be changed)

syntax
-----
String s = "Hello world!";

Methods
=======
1. char charAt(int index)
2. int compareTo(String anotherstring)
3. String concat(String str)
4. boolean endsWith(String suffix)
5. boolean equals(Object obj)
6. int indexOf(int ch) + 3 overlaod
7. boolean isEmpty()
8. int length()
9. String trim()
*/


class StringDemo
{
	public static void main(String args[])
	{
		int a;
		String s = "Hello world!";
		System.out.println(s);
		
		char ch = s.charAt(6);
		System.out.println(ch);
		
		a = s.compareTo("Easter");
		System.out.println(a);
		
		String sr=s.concat("Incredeble");
		System.out.println(sr);
		
		 boolean b=s.endsWith("d!");
		 System.out.println(b);
		 
		  boolean q=s.equals("d!");
          System.out.println(q);
		
          boolean m=s.isEmpty();
          System.out.println(m);
		  
		  s="";
          m=s.isEmpty();
          System.out.println(m);
		  
		  a=s.indexOf("Hello");
		  a=s.indexOf("Hello",4);
		
	
	}
}