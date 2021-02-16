//An example of 'final' keyword
// Using "final" with method arguments.

class Gizmo 
{
public void spin() {}
}

public class FinalDemo3 
{
	void with(final Gizmo g) 
	{
	//! g = new Gizmo(); // Illegal -- g is final
	}

	void without(Gizmo g) 
	{
	g = new Gizmo(); // OK -- g not final
	g.spin();
	}
	// void f(final int i) { i++; } // Can't change
	// You can only read from a final primitive:
	int g(final int i) { return i + 1; }

	public static void main(String[] args) 
	{
	FinalDemo3 bf = new FinalDemo3();
	bf.without(null);
	bf.with(null);
	}
} 