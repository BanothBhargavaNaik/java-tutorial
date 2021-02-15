/*

Packages
--------
Group of related classes is a package

Uses
----
1. Easy to write and maintain code
2. To avoid name conflicts

Types
-----
1. Inbuilt packages

	Already defined in Java API (Application Programming Interface)
	Input,Output,Database etc,.
	
2. User defined packages
	Created by the user
	
	
	packages-->classes-->variables,methods...

syntax
------
keyword - import

import java.util.Scanner;

java.util --> package
Scanner --> class present in util

import java.util.*;

* - all 

create package
------------
package name;

Steps
----
1. Create a class along with package name
2. Compile 
	javac -d . ClassName.java
	
3. Create another class along with import
	Make an object and call the required method
	
4. Compile and run the class
*/


package pack;
public class PackDemo
{
	public void show()
	{
		System.out.println("Inside PackDemo class");
	}
}