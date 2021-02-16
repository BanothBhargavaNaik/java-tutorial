/* Concept of overriding */

public class Earth5 extends Planet
{
    public void override()
	{
        System.out.println("The override method in Earth.");
    }

    public static void main(String[] args) {
        Earth5 myEarth = new Earth5();
        Planet myPlanet = (Planet)myEarth;
       hide();    //static methods need not have to be called using reference              
					  // here check the ouput with the previous output	
        myPlanet.override();
    }
}
/*~Itsraj~*/