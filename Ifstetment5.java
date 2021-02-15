import java.util.*;
class Ifstetment5
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
float a,b,c,tot,per;
System.out.print("Enter a:");
a=sc.nextFloat();
System.out.print("Enter b:");
b=sc.nextFloat();
System.out.print("Enter c:");
c=sc.nextFloat();
if(a>b && a>c)
System.out.println(a+" is greater");
else
if(b>a && b>c)
System.out.println(b+" is greater");
else
if(c>a && c>b)
System.out.println(c+" is greater");
else
System.out.println("all are equal");
}
}