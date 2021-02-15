  import java.util.*;
class Forloop
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int i,n,count=0;
System.out.print("Enter n:");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
count++;
}
if(count==2)
System.out.println("prime");
else
System.out.println("not prime");
}
}