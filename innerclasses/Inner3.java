
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
public static class InnerClass
{
public int n;
}
}
public class Inner3
{
public static void main(String args[])
{
OuterClass.InnerClass i = new OuterClass.InnerClass();
i.n=10;
System.out.println(i.n);
}
}
