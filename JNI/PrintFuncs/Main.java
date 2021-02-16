// Simple java class to test print methods in PrintFuncs class

class Main 
{
  public static void main(String[] args) 
  {
    PrintFuncs pf = new PrintFuncs();
    pf.printStringJava("This is printed without using native code.");
    pf.printStringNative("This is printed by a callback into Java from C++.");
  }
}
