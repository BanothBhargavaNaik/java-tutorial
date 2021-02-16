/* Program using "switch" case. Try changing the value of 'i'. */

class Switch4{ 
	public static void main(String args[]){
                int i;
                i=23;
                System.out.println(i);
                switch(i){
                        case (22+ 1):
                                System.out.println(" 'i' value is 23");
                                break;
                        case 2:
                                System.out.println(" 'i' value is 2");
                                break;
                        case 3:
                                System.out.println(" 'i' value is 3");
                                break;
                       default:
                                System.out.println(" 'i' value is " +i);
                                break;
                }
	}

}
