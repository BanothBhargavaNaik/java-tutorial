import java.util.*;

class Person
{
	Scanner sc = new Scanner(System.in);
	
	String name;
	int age;
	int mobile;
	
	void accept()
	{
		System.out.println("\nEnter name,age,mobile");
		name = sc.nextLine();
		age = sc.nextInt();
		mobile = sc.nextInt();
	}
	
	void show()
	{
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Mobile = "+mobile);
		
	}
}


class Student extends Person
{
	int roll;
	int section;
	String school;
	
	void accept()
	{
		super.accept();
		System.out.println("\nEnter roll,section,school");
		roll = sc.nextInt();
		section = sc.nextInt();
		school = sc.next();
	}
	
	void show()
	{
		
		super.show();
		System.out.println("Roll = "+roll);
		System.out.println("Section = "+section);
		System.out.println("School = "+school);
		
	}
}

class Teacher extends Person
{
	int id;
	String school;
	int salary;
	
	void accept()
	{
		super.accept();
		System.out.println("\nEnter id,school,salary");
		id = sc.nextInt();
		school = sc.next();
		salary = sc.nextInt();
	}
	
	void show()
	{
		
		super.show();
		System.out.println("Id = "+id);
		System.out.println("salary = "+salary);
		System.out.println("School = "+school);
		
	}
}

class Staff extends Person
{
	int id;
	String school;
	int salary;
	
	void accept()
	{
		super.accept();
		System.out.println("\nEnter id,school,salary");
		id = sc.nextInt();
		school = sc.next();
		salary = sc.nextInt();
	}
	
	void show()
	{
		super.show();
		System.out.println("Id = "+id);
		System.out.println("salary = "+salary);
		System.out.println("School = "+school);
		
	}
}

class PersonDemo
{
	public static void main(String args[])
	{
		Student s = new Student();
		Teacher t = new Teacher();
		Staff st = new Staff();
		
		System.out.println("\nEnter Student details\n");
		s.accept();
		
		System.out.println("\nEnter Teacher details\n");
		t.accept();
		
		System.out.println("\nEnter Staff details\n");
		st.accept();
		
		System.out.println("\nStudent details\n");
		s.show();
		System.out.println("\nTeacher details\n");
		t.show();
		System.out.println("\nStaff details\n");
		st.show();
	}
}
