/*

OOP
---
Object Oriented Programming
- mainly based on classes and objects

1. Class and object
2. Encapsulation
3. Inheritance
4. Polymorphism
5. Abstraction

Class
-----
A blueprint/template which can be used build objects
Class consists of members - variables and methods

variables(attributes)
methods(behavior)

Car class
---------

variables - name,model,speed,petrol....
methods - startcar(),stop(),distance()..... 

Car Object
----------
1. Alto object

variables - name = alto
            speed = 100
			--
			
methods - startcar(), alto will start


syntax
------

class - keyword

class <classname>
{
	type1 var1;
	type2 var2;
	type3 var3;
	--
	
	void method1()
	{
		
	}
	void method2()
	{
		
	}
	
	void method3()
	{
		
	}
	
	--
}

Object
------
<classname> obj = new <classname>();

Acessing
--------

'.' dot operator

obj.var1;

*/
import java.util.*;
class Rectangle
{
	int l,b,i,fact=1;

		void fact(int n)
		{
		for( i=1;i<=n; i++)
		{
			
			fact=fact*i;
		}
		System.out.println("factorial=" +fact);
		}

	 
	
}
class ObjectDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Rectangle r = new Rectangle();
 		System.out.println("Enter two numbere:");
		r.l = sc.nextInt();
		r.b = sc.nextInt();
		System.out.println("Length = "+r.l);
		System.out.println("Breadth = "+r.b);
		System.out.println("Area = "+(r.l * r.b));
		r.fact(7);
		

		
		
		
		
	}
}