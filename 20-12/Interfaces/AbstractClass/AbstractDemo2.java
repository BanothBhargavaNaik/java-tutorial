//An Example of Abstract Classes using Constructors and polymorphism
// don't produce the output what you might expect.

abstract class Glyph
{
abstract void draw();
Glyph() 
	{
	System.out.println("Glyph() before draw()");
	draw();
	System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph 
{
int radius = 1;
RoundGlyph(int r) 
	{
	radius = r;
	System.out.println("RoundGlyph.RoundGlyph(), radius = "+ radius);
	}
void draw() 
	{
	System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
}

public class AbstractDemo2
{
public static void main(String[] args) 
{
	new RoundGlyph(5);
}
} 