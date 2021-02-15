import java.io.*;
import java.util.*;
class BufferDemo1
{
	public static void main(String ags[])throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("tell me your name");
		String s=br.readLine();
		
		if(s.equals("Alekhya")||s.equals("alekhya"))
		{
			System.out.println("Hellow" + s +",how are you");
			System.out.println("\n Now you tell me your age");
			
			int age=Integer.parseInt(br.readLine());
			
			if(age>25)
			{
				System.out.println("Hellow big brother!");
			}
			else
			{
			System.out.println("Hellow small brother!");
			}
		}
	
		else
		{
			System.out.println("Sorry ,I dont know");
		}
	}


}