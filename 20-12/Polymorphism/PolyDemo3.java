import java.lang.*;

class Sample
{
int n=10;
public String toString()
{
return n+"";
}
}
class Sample1
{
int n=10;
String name="sadashiv";

public String toString()
{
return n+" " +name;
}
}

public class PolyDemo3
{
public static void print(Object o)
{
System.out.println(o.toString());
}
public static void main(String args[])
{
Sample s = new Sample();
print(s);
print(new Sample1());
System.out.println(s);
System.out.println(new Sample1());
}
}