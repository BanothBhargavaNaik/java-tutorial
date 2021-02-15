class NewThread extends Thread
{
	NewThread()
	{
		super("DemoThread");
		System.out.println("Child Thread:"+this);
		start();
	}
	public void run()
	{
		try
		{
			for(int i=5;i>=1;i--)
			{
              System.out.println("Child Thread:"+i);
               Thread.sleep(800);
			}
		}
      catch(InterruptedException e)
	  {
		System.out.println("Child Thread interrupted"); 
	  }
    System.out.println("Child Thread exiting");
	}
}
 class ExtendThread
 {
  public static void main(String args[])
  {
   new NewThread();
   
    try
	{
		for(int a=5;a>=1;a--)
		{
			System.out.println("main Thread:"+ a);
			Thread.sleep(2000);
		}
	}
	catch(InterruptedException e)
	{
		System.out.println("main Thread interrupted");
	}
	System.out.println("Main Thread exiting");
  }
 }
	
			
	   
	  
        		  