/*

<modifier> class <classname> extends <baseclassname>
{
members;
}

to reuse the code and data
to add new members
to modify already existing members.
*/

import java.lang.*;

class BClass
{
private  void show()
{
System.out.println("from show");
}
}

class Dclass extends BClass
{
public void display()
{
System.out.println("from display");
}
}
public class InDemo
{
public static void main(String args[])
{
Dclass d= new Dclass();
//d.show();
d.display();
}
}