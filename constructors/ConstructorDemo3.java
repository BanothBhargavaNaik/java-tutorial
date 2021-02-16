
class ConstructorDemo3
{
	int a=10,b=20,c;
   	String str1;
    String str2 = "Addition Of Two Values : ";
	public ConstructorDemo3()
	{

      
	   // Function with no args but return Values
	   str1 = displayMessage();
	   System.out.println(str1);
	   
	   
	   // Function with args but no return values
	   displayOperation(str2);
      
       // Function with args and return values 
	   c = addingNumbers(a,b);
	   System.out.println(c);

       // Function with no args and no return values
	   complete();
	} // end of constructor


	String displayMessage()
	{
		       return "Calling Methods from Constructor";
	}
	void displayOperation(String msg)
	{
		       System.out.print(msg);
	}
	int addingNumbers(int x, int y)
	{
       
	   return (x+y);
	}
	void complete()
	{
		      System.out.println("Bye");
	}
    
	public static void main(String[] args) 
	{

		ConstructorDemo3 cd3 = new ConstructorDemo3();
	}
}
