/* Program using "switch" case which uses a default case.
	Default case can be placed anywhere in the loop.
	Try this example by entering a number > 4.
*/

class Switch3{ 
	public static void main(String args[]){
		int i;
                i=1;
                System.out.println("enter a no");
                i=Scan.readInt();
                 System.out.println(i);
                switch(i){
                        case 1:
                                System.out.println("Entered one");
                                
                        case 2:
                                System.out.println("Entered two");
                                break;
                        case 3:
                                System.out.println("Entered Three");
                                break;
                        default:
                                 System.out.println(" Wrong choice");
                                break;
                         case 4:
                                 System.out.println(" Enetered Four ");
                }
	}

}
