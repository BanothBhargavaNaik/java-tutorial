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
public BClass()
{
System.out.println("from Class");
}
}

class Dclass extends BClass
{
public Dclass()
{
System.out.println("from Dclass");
}
}
public class InConDemo
{
public static void main(String args[])
{
Dclass d= new Dclass();
}
}