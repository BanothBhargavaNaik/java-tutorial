/*

Scanner class
----------------
import java.util.*;
(or)
import java.util.Scanner;

* all

Creating an object
------------------------
Scanner sc = new Scanner(System.in);

Scan methods
-----------------

sc.nextInt() - Integer
sc.nextFloat() - Float
sc.nextDouble()

sc.next()
sc.nextLine()

sc.next().charAt(0)
*/

import java.util.*;

class ScanDemo
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	
	int a,b,c,tot;
	System.out.print("Enter a: ");
	a = sc.nextInt();
	System.out.print("Enter b: ");
	b = sc.nextInt();
	System.out.print("Enter c: ");
	c = sc.nextInt();
	
	System.out.println("Sum = "+(a+b));
	System.out.println("sub = "+(a-b));
	System.out.println("mul = "+(a*b));
	System.out.println("div= "+(a/b));
	System.out.println("mod = "+(a%b));
	System.out.println("Si = "+(a*b*c/100));
	tot=a+b+c;		
	System.out.println("tot = "+(a+b+c));
	System.out.println("per = "+(tot/3));
	}
}

/*

1. Add, SUb, Mul, Div, Mod
2. Simple interest
3. Subjects,Total,Percentage

*/