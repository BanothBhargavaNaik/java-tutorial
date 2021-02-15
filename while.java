 /* import java.util.*;
class while
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a,r;
System.out.print("Enter a:");
a=sc.nextInt();
System.out.print("Enter r:");
r=sc.nextInt();
a=r;
while(a>=1)
{
System.out.println("a");
a--;
}
}
}
*/
/*
import java.util.*;
class while
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a,r;

System.out.print("Enter r:");
r=sc.nextInt();
a=1;
while(a<=10)
{
System.out.println("table="+(r*a));
a++;
}
}
}
*/
import java.util.*;
class while
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a,r;

System.out.print("Enter r:");
r=sc.nextInt();
a=1;
do
{
if(a%2==0)
System.out.println("a");
a++;
}
while(a<=r);
}
}
