import java.util.*;
class Ifstetment6
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
if(a==b && a==c)
System.out.println("equillater triangle");
else
if((a==b)||(b==c)||(c==a))
System.out.println("isosceles triangle");
else
System.out.println("triangle");
}
}