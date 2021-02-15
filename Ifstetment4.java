import java.util.*;
class Ifstetment4
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
tot=a+b+c;
per=tot/3;

if(per>=60)
System.out.println("ist div");

else
if(per>=50)
System.out.println("2nd div");

else
if(per>=30)
System.out.println("3rd div");

else
System.out.println("failed");



}
}