class ObjTest 
{
	void display()
	{
       System.out.println("Class Details");
	}
	public static void main(String[] args) 
	{
		ObjTest t = new ObjTest();
		t.display();
		System.out.println("Class Name : "+t.getClass());
		System.out.println("Class Name : "+t.getClass().getName());
	}
}
