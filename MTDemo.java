class MTDemo
{
	public static void main(String args[])
	{
		Thread t=Thread.currentThread();
		System.out.println("current Thread="+t);
		t.setName("other Thread");
		System.out.println("after change name="+t);
		try
		{
			for(int a=7;a>=3;a--)
			{
				System.out.println(a);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
				System.out.println("Thread interapation");
		}
		
        
	}		
}
			