/* With concrete or abstract classes, inner classes
	are the only way to produce the effect of "multiple implementation inheritance."
*/

class C {}

abstract class D {}

class Z extends C 
{
	D makeD() { return new D() {}; }
}

public class AbstractDemo4
{
static void takesC(C c) {}
static void takesD(D d) {}
public static void main(String[] args) 
{
Z z = new Z();
takesC(z);
takesD(z.makeD());
}
} 