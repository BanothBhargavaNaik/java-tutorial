/* An example of interface. This is implemented by InterfaceDemo.java  */

interface Instrument
{
		// Compile-time constant:
		int i = 5; // static & final
		// Cannot have method definitions:
		void play(); // Automatically public
		String what();
		void adjust();
}