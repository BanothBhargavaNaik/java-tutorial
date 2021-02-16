/* Concept of overriding */

public class Earth4 extends Planet {
    public static void hide() {
        System.out.println("The hide method in Earth.");
    }
    public void override() {
        System.out.println("The override method in Earth.");
    }

    public static void main(String[] args) {
        Earth4 myEarth = new Earth4();
        Planet myPlanet = (Planet)myEarth;
        Planet.hide();    //static methods need not have to be called using reference              
        myPlanet.override();
    }
}
