import java.util.*;

class Forloop4
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int i, n,count=0;
System.out.print("Enter n:");
n=sc.nextInt();
for(i=2;i<=n;i++)
{
if(n%i==0)
{
count=1;
break;
}
}
if(count==0)
System.out.println("prime");
else
System.out.println("not prime");

}
}











