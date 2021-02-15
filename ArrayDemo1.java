/*
Array
-----
Collection of similar type elements

Syntax

------

type[] var = new type[size];



*/
import java.util.*;

class ArrayDemo1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		
		for(int a = 0;a<4;a++)
		{
			System.out.print("num["+a+"]: ");
			num[a] = sc.nextInt();
		}
		
		
		for(int a = 0;a<4;a++)
		{
		if(num[a]%2==0)
			num[a]=num[a]+5;
		else
			num[a]=num[a]-3;
		}
		System.out.println("\nNew Array elements: ");
		for(int a=0;a<4;a++)
		{
		System.out.println("num["+a+"]: "+num[a]);
		}
		
			
		}
		
	}
