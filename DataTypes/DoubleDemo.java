/* This  Program is a simple java Application which	prints
	 the  minimum and maximum values for double data type
*/
/* Try this example with jdk1.5 version */

class DoubleDemo{ 
	public static void main(String args[]){

		System.out.println(" For an Double");
		System.out.println("Size is : "+Double.SIZE);  //for jdk version lesser than 1.5 'SIZE' does not work

		double i1 = Double.MAX_VALUE;
		double i2 = Double.MIN_VALUE ;

		System.out.println("Max value is : "+i1);
		System.out.println("Min  Value is : "+i2);
		
	}	
}