// Simple use of the "this" keyword.

public class ThisDemo1
{
	int i = 0;
	ThisDemo1 increment()
	{
		i++;
		return this;
	}

	void print() 
	{
		System.out.println("i = " + i);
	}

	public static void main(String[] args) 
	{
		ThisDemo1 x = new ThisDemo1();
		x=x.increment();
		x=x.increment();
		x=x.increment();
		x.print();	
		x.increment().increment().increment().print();
	}
} 