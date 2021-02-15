import java.util.*;
class Ifstetment7
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
float a,b,c,d;
System.out.print("Enter a:");
a=sc.nextFloat();
System.out.print("Enter b:");
b=sc.nextFloat();
System.out.print("Enter c:");
c=sc.nextFloat();
System.out.print("Enter d:");
d=sc.nextFloat();

if(a==b && b==c&& c==d && d==a)
System.out.println("square");
else
if((a==c )&&(b==d))
System.out.println("rectangle");
else
System.out.println("rhymbous");

}
}