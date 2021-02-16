// Simple java class that contains two print methods
//This class is instantiated by the Main.java

class PrintFuncs
{
  public native void printStringNative(String s);

  public void printStringJava(String s)
  {
    System.out.println(s);
  }

  static 
  {
    System.loadLibrary("PrintFuncsImp");
  }
}

