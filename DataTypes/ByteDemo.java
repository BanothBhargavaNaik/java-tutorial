/* This  Program is a simple java Application which	prints
	 the  minimum and maximum values for byte data type
*/
/* Try this example with jdk1.5 version */

class ByteDemo{ 
	public static void main(String args[]){

		System.out.println(" For an Byte");
		System.out.println("Size is : "+Byte.SIZE);  //for jdk version lesser than 1.5 'SIZE' does not work

		byte i1 = Byte.MAX_VALUE;
		byte i2 = Byte.MIN_VALUE ;

		System.out.println("Max value is : "+i1);
		System.out.println("Min  Value is : "+i2);
		
	}	
}