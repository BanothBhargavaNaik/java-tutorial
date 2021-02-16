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
public BClass()
{
System.out.println("from BClass  " );
}
}

class Dclass extends BClass
{
public Dclass()
{
System.out.println("from Dclass");
}

}
class Dclass2 extends Dclass
{
public Dclass2()
{
System.out.println("from dclass2");
}
}
public class InConDemo2
{
public static void main(String args[])
{
Dclass2 d1 = new Dclass2();
}
}