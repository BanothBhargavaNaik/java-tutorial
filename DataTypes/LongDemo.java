/* This  Program is a simple java Application which	prints
	 the  minimum and maximum values for long data type
*/
/* Try this example with jdk1.5 version */

class LongDemo{ 
	public static void main(String args[]){

		System.out.println(" For an Long");
		System.out.println("Size is : "+Long.SIZE);  //for jdk version lesser than 1.5 'SIZE' does not work

		long i1 = Long.MAX_VALUE;
		long i2 = Long.MIN_VALUE ;

		System.out.println("Max value is : "+i1);
		System.out.println("Min  Value is : "+i2);
		
	}	
}/*~Itsraj~*/