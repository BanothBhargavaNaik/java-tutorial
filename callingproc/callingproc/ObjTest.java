//Using Objects as Parameters

class ObjTest
 {
    int a,b;
    ObjTest(int i,int j)
     {
        a = i;
        b = j;
      }
     //Return True if 'o' is equal to the invoking object
     boolean equals(ObjTest o)
       {
          if(o.a == a || o.b == b)
           {
              return true;
            }
          else
            return false;
        }
       public static void main(String args[])
         {
             ObjTest ob1 = new ObjTest(100,22);
             ObjTest ob2 = new ObjTest(100,22);
             ObjTest ob3 = new ObjTest(-1,-1);
             System.out.println("Ob1 = ob2 : "+ob1.equals(ob2));
             System.out.println("Ob1 = ob3 : "+ob1.equals(ob3));

           }
     }
