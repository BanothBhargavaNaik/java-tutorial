

/* In a same Package how a private method of one
	class	is not accessible from another class is shown 
*/

package One;

public class DeltaOne{
    public static void main(String[] args) {
        Alpha a = new Alpha();
        //a.privateMethod();    //illegal
        a.packageMethod();    //legal
        a.protectedMethod();  //legal
        a.publicMethod();     //legal

        //System.out.println("iamprivate: " + a.iamprivate);       //illegal
        System.out.println("iampackage: " + a.iampackage);       //legal
        System.out.println("iamprotected: " + a.iamprotected);   //legal
        System.out.println("iampublic: " + a.iampublic);         //legal
    }
}/*~Itsraj~*/
