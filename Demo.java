/*

To check if java is installed
------------------------------------
Windows + R 
Type cmd
Click OK

Command prompt
------------------------
Type javac and press Enter

1.D:
2. cd New Java
(cd - change directory)
3. dir
(list of files and floders)

cls - clear screen


Strutucure
------------

class <classname>
{
	public static void main(String args[])
	{
	stmt;
	----
	---
	}
}

classname should be same as file name

Print statement
--------------------
System.out.println();

Compile
---------
javac <file.java>

Run
-----
java <file>

*/

//class - keyword

class Demo
{
	public static void main(String args[])
	{
	System.out.println("Hello, Welcome to Java");
	int a = 7,b=5,c;
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	System.out.println("Sum = "+(a+b)); 

	c=a+b;
	System.out.println("c = "+c);
	}
}


