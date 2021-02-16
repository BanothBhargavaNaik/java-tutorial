/* Program using "if" and "else" constructs*/

class IfDemo2{ 
	public static void main(String args[]){
		int i;
		i=22 +33;
		// The below if compiles
		if (i > 22){
			System.out.println("i is greater than 22");
		}
		else{
			System.out.println("i is less than 22");
		}
		/*This if gives an error. Try the Example with if(true) and execute.
			This gives the difference between java & c compiler
		*/
		if (1) 
		System.out.println("in if(1)");
		System.out.println("====end====");
	}	
}