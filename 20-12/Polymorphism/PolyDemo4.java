class Bclass
{
public void show()
{
System.out.println("From bclass show()");
}
}
class Dclass extends Bclass
{
public void show()
{
System.out.println("From Dclass show()");
}
}
class Dclass1 extends Dclass
{
public void show()
{
System.out.println("From Dclass1 show()");
}
}
public class PolyDemo4
{
public static void print(Bclass b)
{
b.show();
}
public static void main(String args[])
{
print(new Dclass());
print(new Dclass1());
}
}