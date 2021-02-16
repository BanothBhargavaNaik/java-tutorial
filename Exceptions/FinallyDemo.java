class FinallyDemo
{

public static void main(String args[])
{
int a=10,b=2,c=0;
try
{
c = a/b;
return;
}catch(Exception ex)
{ System.out.println(ex); }
finally
{
System.out.println("From finally");
}
System.out.println("From main");
}
}