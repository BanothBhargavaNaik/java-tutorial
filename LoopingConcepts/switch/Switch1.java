/* Program using "switch" case */

class Switch1 { 
	public static void main(String args[]){
		int i;
                i=1;
                System.out.println("enter a no");
                i=Scan.readInt();
                 System.out.println(i);
                switch(i){
                        case 1:
                                System.out.println("Entered one");
                                break;
                        case 2:
                                System.out.println("Entered two");
                                break;
                        case 3:
                                System.out.println("Entered Three");
                                break;
                       default:
                                System.out.println(" Wrong choice");
                                break;
                }
	}

}
