
/*Bits and Bytes Computer Education -Hanamkonda-9866129388*/
/*Faculty: Mr.SADASHIV.*/

import java.io.*;
public class Deposit extends Bank
{
	public Deposit(int Accno,String Accname)
	{
		this.Accno=Accno;
        this.Accname =Accname;
		
	}
	public static void main(String[] args) 
	{     
		Bank B=new Bank();
		String s;
		try
		{

BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("enter the acount number");
          s=input.readLine();
		  B.Accno=Integer.parseInt(s);
		  System.out.println("enter the acount holder name");
          B.Accname=input.readLine();  
		}
		catch(IOException e){}
	}
}
