class A
{
static int i=50;
void decreament()
{
i--;
}
.
void show()
{
System.out.println(" i="+i);

}
}
class staticDec
{
	public static void main(String args[])
	{
		A obj1=new A();
		A obj2=new A();
		
		obj1.show();
		obj2.show();
		
		
		obj1.decreament();
		obj1.show();
		
        obj2.decreament();
		obj2.show();
		obj1.show();
		
	}
   }
  
		
		
		
		
		
		