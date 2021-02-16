/* This  Program is a simple java Application which	prints
	 the  minimum and maximum values for float data type
*/
/* Try this example with jdk1.5 version */

class FloatDemo{ 
	public static void main(String args[]){

		System.out.println(" For an Float");
		System.out.println("Size is : "+Float.SIZE);  //for jdk version lesser than 1.5 'SIZE' does not work

		float i1 = Float.MAX_VALUE;
		float i2 = Float.MIN_VALUE ;

		System.out.println("Max value is : "+i1);
		System.out.println("Min  Value is : "+i2);
		
	}	
}