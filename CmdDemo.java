/*
Command Line Arguments
----------------------
Values given to program during executing the command

syntax
------
java Name v1 v2 v3...

*/

class CmdDemo
{
	public static void main(String args[])
	{
		String s = args[0];
		System.out.println("First value = "+s);
		
		for(int a=0;a<args.length;a++)
		{
			System.out.println(args[a]);
		}
	}
}