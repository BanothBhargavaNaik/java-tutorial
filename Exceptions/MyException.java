class ChainedException extends RuntimeException {
  private Throwable cause = null;

  public ChainedException() {
    super();
  }

  public ChainedException(String message) {
    super(message);
  }

  public ChainedException(String message, Throwable cause) {
      super(message);
      this.cause = cause;
  }
}

class MyException 
{
	public static void main(String[] args) 
	{
		int a=10,b=0,c=0;
		try
		{
        c=a/b;
	    }
		catch (ArithmeticException ae)
		{
		throw new ChainedException("Error in Program",ae);
		}
	}
}
