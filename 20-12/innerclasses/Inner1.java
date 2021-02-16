
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
public class InnerClass
{
public int n;
}
}
public class Inner1
{
public static void main(String args[])
{
OuterClass o = new OuterClass();// object of outerclass
OuterClass.InnerClass i = o. new InnerClass();
i.n =10;
System.out.println(i.n);
}
}
