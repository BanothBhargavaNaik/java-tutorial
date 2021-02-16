//Call By Reference
class CalByRef
 {
    int a,b;
    CalByRef(int i,int j)
     {
        a = i;
        b = j;
      }
    void method(CalByRef cbr)
     {
        cbr.a *= 2;
        cbr.b /= 2;
      }

     public static void main(String args[])
      {
         CalByRef cbr = new CalByRef(15,20);
         System.out.println("cbr.a and cbr.b before call : "+cbr.a+"  "+cbr.b);
         cbr.method(cbr);
         System.out.println("cbr.a and cbr.b After call : "+cbr.a+"  "+cbr.b);
       }

  }
