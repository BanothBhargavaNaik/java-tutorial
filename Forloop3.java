import java.util.*;

class Forloop3
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int i, n,fact=1;
System.out.print("Enter n:");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("factorial="+fact);
}
}

