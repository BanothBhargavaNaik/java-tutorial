//An example of 'final' keyword
// "Blank" final data members.

class Poppet { }

class FinalDemo2  
{
	final int i = 0; // Initialized final
	final int j; // Blank final
	final Poppet p; // Blank final reference

	// Blank finals MUST be initialized in the constructor:
	FinalDemo2 () 
	{
		j = 1; // Initialize blank final
		p = new Poppet();
	}

	FinalDemo2 (int x) 
	{
		j = x; // Initialize blank final
		p = new Poppet();
	}

	public static void main(String[] args) 
	{
		FinalDemo2  bf = new FinalDemo2 ();
	}
}