


public class Earth2 extends Planet {
    public static void hide() {
        System.out.println("The hide method in Earth.");
    }
    public void override() {
        System.out.println("The override method in Earth.");
    }

    public static void main(String[] args) {
        Planet myPlanet = new Planet();
        myPlanet.hide();                   
        myPlanet.override();
    }
}
