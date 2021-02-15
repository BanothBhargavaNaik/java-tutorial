/*
Array
-----
Collection of similar type elements

Syntax
------

type[] var = new type[size];



*/
import java.util.*;

class ArrayDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int a = 0;a<4;a++)
		{
			System.out.print("arr["+a+"]: ");
			arr[a] = sc.nextInt();
		}
		
		System.out.print("\nArray elements: ");
		for(int a = 0;a<4;a++)
		{
			System.out.print(arr[a]+" ");
		}
		
	}
}