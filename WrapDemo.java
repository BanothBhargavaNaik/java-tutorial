import java.util.*;
class WrapDemo
{
	public static void main(String args[])
	{
		Integer i=345;
		Float f=34.5f;
		Character r='h';
		System.out.println(i);
		System.out.println(f);
        
		System.out.println("\n using methods");
		
		System.out.println(i.intValue());
		System.out.println(f.floatValue());
		System.out.println(r.charValue());
		
		String s=i.toString();
		
		System.out.println(" length of i =" + s.length());
		System.out.println(" length of f =" + s.length());
	}
}