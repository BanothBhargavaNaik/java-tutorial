

class Employee 
{
	private String ename;
	private int esal;
	private String edes;
	static int ecount;
	public Employee(){
		ecount++;
	}
}
public class Test{
	
	
	public static void main(String[] args) 
	{
	Employee e1= new Employee();
	Employee e2= new Employee();
	  
		System.out.println(e1.ecount+","+e2.ecount+","+Employee.ecount);
	}
}
