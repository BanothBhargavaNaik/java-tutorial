
/*
class Outer
{
class Innerclass
{
}
}
*/

class OuterClass
{
private class InnerClass
{
public int n;
}
InnerClass i = new InnerClass();
public void show()
{
i.n =10;
System.out.println(i.n);
}
}
public class Inner2
{
public static void main(String args[])
{
OuterClass o = new OuterClass();// object of outerclass
o.show();


}
}
