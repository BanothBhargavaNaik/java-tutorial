class MemoryTest 
{
	public static void main(String[] args) 
	{
		Runtime r = Runtime.getRuntime();
		System.out.println("Total Memory In Current Drive : "+r.totalMemory());
		System.out.println("Free Memory In Current Drive  : "+r.freeMemory());
	}
}
		