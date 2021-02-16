/* This  Program is a simple java Application which prints
	 the minimum and maximum values for int data type
*/
/* Try this example with jdk1.5 version */
class IntDemo{ 
	public static void main(String args[]){

		System.out.println(" For an Integer ");
		System.out.println("Size is : "+Integer.SIZE);  //for jdk version lesser than 1.5 'SIZE' does not work

		int i1 = Integer.MAX_VALUE;
		int i2 = Integer.MIN_VALUE ;

		System.out.println("Max value is : "+i1);
		System.out.println("Min  Value is : "+i2);
		
	}	
}/*~Itsraj~*/