

// This is an example of Clone behaviour without implementing the Clonable interface

// The clone() operation works for only a few
// items in the standard Java library.

import java.util.*;

class Int 
{
	private int i;

	public Int(int ii) 
	{
		i = ii;
	}

	public void increment()
	{
		i++;
	}
	
	public String toString() 
	{
	return Integer.toString(i);
	}
}

public class CloneDemo3
{
	public static void main(String[] args)
	{

	ArrayList v = new ArrayList();
	for(int i = 0; i < 10; i++ )
	v.add(new Int(i));
	System.out.println("v: " + v);

	ArrayList v2 = (ArrayList)v.clone();
	// Increment all v2's elements:
	for(Iterator e = v2.iterator();	e.hasNext(); )

	((Int)e.next()).increment();
	// See if it changed v's elements:
	System.out.println("v: " + v);
	}
} 