
/*
static members

static data members or class datamebers
static int x;

the static variables are created before main execution.
these variables are created only once in entire program execution.

these can retain their previous function call values.
in general these are used to provided common value  to all the objects of a class.
bydefault static variable is initialized with 0.
these variables can be accessed with classname. // classname.variable;

static member methods or class methods
static void show()
{
}
*/


class StaticData
{
public static int x;
public static void main(String args[])
{
StaticData a = new StaticData();
StaticData b = new StaticData();
StaticData c = new StaticData();
System.out.println(a.x);
System.out.println(b.x);
System.out.println(c.x);
System.out.println(StaticData.x);
a.x=100;
System.out.println(a.x);
System.out.println(b.x);
System.out.println(c.x);
System.out.println(StaticData.x);
c.x=0;
System.out.println(a.x);
System.out.println(b.x);
System.out.println(c.x);
System.out.println(StaticData.x);
StaticData.x =200;
System.out.println(a.x);
System.out.println(b.x);
System.out.println(c.x);
System.out.println(StaticData.x);

}

}