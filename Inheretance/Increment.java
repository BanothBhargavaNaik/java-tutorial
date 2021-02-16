class Increment extends GetData
{
	
	void updateSal()
	{
      sal = sal +((sal/100)*10);
	  System.out.println("Updated Salary is  : "+sal);
	}
	public static void main(String[] args) 
	{
		Increment i = new Increment();
        if(args.length < 3)
		{
          System.out.println("Plz Give Three Args(Name, Job, Sal)");
		}
		else
		{
	    	String name = args[0];
			String job = args[1];
			int sal = Integer.parseInt(args[2]);
			i.showDetails(name,job,sal);
			i.updateSal();
		}
		

	}
}
/*~Itsraj~*/