/* This  Program is a simple java Application which	prints
	 the  minimum and maximum values for short data type
*/
/* Try this example with jdk1.5 version */

class ShortDemo{ 
	public static void main(String args[]){

		System.out.println(" For an Short");
		System.out.println("Size is : "+Short.SIZE);  //for jdk version lesser than 1.5 'SIZE' does not work

		short i1 = Short.MAX_VALUE;
		short i2 = Short.MIN_VALUE ;

		System.out.println("Max value is : "+i1);
		System.out.println("Min  Value is : "+i2);
		
	}	
}/*~Itsraj~*/