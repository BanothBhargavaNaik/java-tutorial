/*

<modifier> class <classname> extends <baseclassname>
{
members;
}

to reuse the code and data
to add new members
to modify already existing members.


**** THE ORDER OF CALLING CONSTRUCTOR IN INHERITANCE IS FROM BASE CLASS TO DERIVED CLASS****
*/

import java.lang.*;

class BClass
{
public BClass(String pass)
{
System.out.println("from Class  :" + pass);
}
}

class Dclass extends BClass
{
public Dclass()
{
super("welcome");
System.out.println("from Dclass");
}
public Dclass(String str)
{
super(str);
System.out.println("from Dclass param");
}
}
public class InConDemo1
{
public static void main(String args[])
{
Dclass d1 = new Dclass();
Dclass d= new Dclass("sada");
}
}