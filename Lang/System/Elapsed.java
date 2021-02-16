class Elapsed 
{
	public static void add(int a, int b)
	{
		System.out.println("a+b= " +(a+b));
	}
	public static void main(String[] args)  throws Exception
	{
		Elapsed e = new Elapsed();
		long start, end;
		System.out.println("Timer started");

		start = System.currentTimeMillis();
		Thread.sleep(100);
		e.add(10,20);
		end = System.currentTimeMillis();

		System.out.println("Elapsed Time:" + (end-start));
		
	}
}
