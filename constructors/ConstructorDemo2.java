
class ConstructorDemo2 
{
	int a,b;
	public ConstructorDemo2(int a,int b)// para meterized constructor
	{
        this.a = a;
		this.b = b;
		System.out.println("The Value Of A Is : "+a);
		System.out.println("The Value Of B Is : "+b);
		System.out.println("The Adding Value  : "+(a+b));

	}
	public static void main(String[] args) 
	{
		ConstructorDemo2 cd2 = new ConstructorDemo2(10,20);

	}
}
