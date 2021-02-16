/* This program shows how to use try - finally blocks.
  Finally block is that block, where the control moves
  irrespective of the exception occured or not.
*/

class TryDemo  { 
	public void Error() throws mychkexception{
		throw (new mychkexception(" exception my myunchkexception"));
	}
	
	public static void main(String args[]){
		
		TryDemo e = new TryDemo();
		// we are not handling the error here
		System.out.println(" before method call");
		try{
		 e.Error();
		} catch (mychkexception mye){
			System.out.println(mye);
		}finally{
		System.out.println("This part of code executes irrespective of the errors that occur in try block" );
		}
	}
}
 