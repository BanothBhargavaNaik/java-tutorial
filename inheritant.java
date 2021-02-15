
/*
 class A
{
int a=5;
int b=5;
void showA()
{
System.out.println("add =" +(a+b));
}

}
class B 
{
  int x=5;
  int y=5;
 void showB()
{
	System.out.println("sub =" +(x-y));
  
}
}
class C extends A,B
{
	void showC(int p,int q)
	{
		System.out.println("add =" +(a+b));
		System.out.println("add =" +(p+q));
	}
}

class inheritant
{
	public static void main(String arg[])
	{
		A obj1=new A();
		B obj2=new B();
		C obj3=new C();
		C obj4=new C();
		obj1.showA();
		obj2.showB();
		obj3.showC( 10,5);
		obj4.showC(10,5);
	}
}

*/

/*

//Multi level inheritance


class A
{
int a=1;

void showA()
{
System.out.println("a =" +a);
}

}
class B extends A
{
int b=2;
void showB()
{
	System.out.println("b =" +b);

}
}
class C extends B
{
	int c=3;
	void showC()
	{
		System.out.println("c =" +c);

	}
}



class inheritant
{
	public static void main(String arg[])
	{
		A obj1=new A();
		B obj2=new B();
		C obj3=new C();
		
		System.out.println("\nUsing A object");
		obj1.showA();
		//obj1.showB();
		
		System.out.println("\nUsing B object");
		obj2.showA();
		obj2.showB();
		
		System.out.println("\nUsing C object");
		obj1.showA();
		obj2.showB();
		obj3.showC();
	}
}

*/

//Multi level inheritance


class A
{
int a=1;

void showA()
{
System.out.println("a =" +a);
}

}
class B extends A
{
int b=2;
void showB()
{
	System.out.println("b =" +b);

}
}
class C extends A
{
	int c=3;
	void showC()
	{
		System.out.println("c =" +c);

	}
}



class inheritant
{
	public static void main(String arg[])
	{
		A obj1=new A();
		B obj2=new B();
		C obj3=new C();
		
		System.out.println("\nUsing A object");
		obj1.showA();
		
		System.out.println("\nUsing B object");
		obj2.showA();
		obj2.showB();
		
		System.out.println("\nUsing C object");
		obj3.showA();
		obj3.showC();
	}
}














































































	