class Class1
{
public void show()
{
System.out.println("Class1 show");
}
}
public class Inner4
{
public static void print(Class1 c)
{
c.show();
}
public static void main(String args[])
{
print(
new Class1()
{
public void show()
{
System.out.println("From anonymous innerclass");
}
}
);

}
/*
public,private,static and anonymous  inner class
*/
}
