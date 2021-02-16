
class ArgsDemo 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		if(args.length < 2)
		{
           System.out.println("You have to pass Two Arguments");
		   System.out.println("\nArgs should be integers otherwise it will give Exception");
		}
		else
		{
          a = Integer.parseInt(args[0]);
		  b = Integer.parseInt(args[1]);
		  c = a+b;
		  System.out.println("Adding Value Of Two Args : "+c);
           
		}

	}
}
