


/* Concept of overriding */

public class Earth1 extends Planet {
    public static void hide() {
        System.out.println("The hide method in Earth.");
    }
    public void override() {
        System.out.println("The override method in Earth.");
    }

    public static void main(String[] args) {
        Earth1 myEarth = new Earth1();
       
        myEarth.hide();                   
        myEarth.override();
    }
}
