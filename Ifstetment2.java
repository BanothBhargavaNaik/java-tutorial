import java.util.*;
class Ifstetment2
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.print("Enter a:");
a=sc.nextInt();
System.out.print("Enter b:");
b=sc.nextInt();
{
if(a>=18)
System.out.println("a is eligible");
else
System.out.println("a is not eligible");
}
{
if(a%2==0)
System.out.println("a is even");
else
System.out.println("a is odd");
}
}
}