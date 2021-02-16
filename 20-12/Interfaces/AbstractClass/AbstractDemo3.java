/* Dynamically changing the behavior of
    an object via composition using abstract class
*/

abstract class Actor
{
abstract void act();
}

class HappyActor extends Actor 
{
public void act()
{
System.out.println("HappyActor");
}
}

class SadActor extends Actor 
{
public void act() {
System.out.println("SadActor");
}
}

class Stage {
Actor a = new HappyActor();
void change() { a = new SadActor(); }
void go() { a.act(); }
}

public class AbstractDemo3
{
public static void main(String[] args) 
{
Stage s = new Stage();
s.go(); // Prints "HappyActor"
s.change();
s.go(); // Prints "SadActor"
}
} 