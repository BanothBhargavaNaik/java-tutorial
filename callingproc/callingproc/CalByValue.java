//Call By Value
class CalByValue
 {
   void method(int a,int b)
    {
       a *= 2;
       b /= 2;
       System.out.println("In Method A and B are : "+a+"  "+b);
     }
   public static void main(String args[])
    {
       CalByValue cbv = new CalByValue();
       int a=12,b=20;
       System.out.println("A and B Before Call : "+a+"  "+b);
       cbv.method(a,b);
       System.out.println("\nA and B After Call : "+a+"  "+b);

     }
  }
