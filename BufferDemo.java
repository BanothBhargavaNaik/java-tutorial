/*

BufferedReader
==============
Used to take input from system as a string

java.io

syntax
------
BufferedReader br = new BufferedReader(Reader);
BufferedReader br = new BufferedReader(Reader,size);

InputStreamReader isr = new InputStreamReader(System.in);

Method
======
String readLine()

Wrapper Class
-------------
Interger.parseInt() - converts into integer
*/
import java.io.*;
class BufferDemo
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter your name: ");
		String s = br.readLine();
		System.out.println("Hi "+s+", how are you?");
		
		System.out.println("What is your age?");
		int age = Integer.parseInt(br.readLine());
		
	}
}